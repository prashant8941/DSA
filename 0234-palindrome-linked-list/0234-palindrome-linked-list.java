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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head ; 
        ListNode fast = head ; 
        int count = 0 ; 
        while( fast != null && fast.next != null ){
            slow = slow.next ; 
            fast =  fast.next.next; 
            count++ ; 
        }
              if (fast != null) {
            slow = slow.next;
        }
        ListNode mid = slow ; 
        ListNode prev = null ; 
        ListNode curr = head ; 
        int val = 0; 
        while( val != count ){
            ListNode nx = curr.next ; 
            curr.next = prev ;
            prev = curr ; 
            curr = nx  ; 
            val++ ; 
            
        }
        ListNode b = prev ; 
        while( b != null || mid != null ){
            if( b.val  !=  mid.val)return false ;
            b = b.next ; 
            mid = mid.next ; 
        }
        return true ; 

        
    }
}