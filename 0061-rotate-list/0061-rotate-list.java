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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
    return head;
        int len = 1 ; 
        ListNode last = head ; 
        while( last.next != null ){
            last = last.next ; 
            len++; 
        }
        k = k % len ; 
        if( k == 0 )return head ; 
        last.next = head ;
        int size = len - k;  
        ListNode rt  = head ; 
        for( int i = 0 ;i < size-1 ;i++){
            rt = rt.next ; 
        }
        ListNode nhead = rt.next ; 
        rt.next = null ; 
        return nhead ; 


        
    }
}