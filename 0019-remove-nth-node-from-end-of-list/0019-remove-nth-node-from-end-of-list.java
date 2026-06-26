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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ; 
        ListNode curr = head ; 
        while( curr != null ){
            curr = curr.next ; 
            count++  ; 
        }
        int rem  = count - n ; 
        int counter = 0 ; 
        ListNode temp =new ListNode(); 
        ListNode ret = temp ; 
        temp.next = head ; 
        while( temp!= null ){
            if(counter == rem  ){
                temp.next = temp.next.next ; 
                break; 
            }
            temp = temp.next ; 
            counter++ ; 
        }
        return ret.next  ; 

        

        
    }
}