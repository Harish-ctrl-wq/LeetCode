/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int sizeA = 0;
        int sizeB = 0;
        if(headA == null || headB == null) return null;
        while(a != null){
            sizeA++;
            a = a.next;
        }
        while(b != null){
            sizeB++;
            b = b.next;
        }
        a = headA;
        b = headB;
        int diff = Math.abs(sizeA - sizeB);
        if(sizeA > sizeB){
            while(diff-- > 0){
                a = a.next;
            }
        }else{
            while(diff-- > 0){
                b = b.next;
            }
        }
       while(a != b){
        a = a.next;
        b = b.next;
       }
        return a;
    }
}