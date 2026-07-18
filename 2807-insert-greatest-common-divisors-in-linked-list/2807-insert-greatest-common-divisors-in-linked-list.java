/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static int gcd(int a, int b){
        while(b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            ListNode next = temp.next;
            int a = gcd(temp.val,next.val);
            ListNode node = new ListNode(a);
            temp.next = node;
            node.next = next;
            temp = next;
        }
        return head;
        
    }
}