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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode curr = head;

        while(curr != null){
            if( curr.next != null && curr.val == curr.next.val ){
                // last duplicate tak jao
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                // sare duplicates skip 
              slow.next = curr.next;
                
               
            }else{
                     slow = slow.next;
                     
             }
             curr = curr.next;
        }

       
       
       return dummy.next; 
        
    }
}
