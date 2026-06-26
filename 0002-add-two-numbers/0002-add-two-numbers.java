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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if( l1 == null && l2 == null ){
            return null; 
        }
        if(l1 == null ){
            return l2 ; 
        }
        if(l2 == null ){
            return l1 ; 
        }

        ListNode curr = new ListNode(0) ; 
        ListNode dummy = curr ; 
        int carry = 0 ; 
        while( l1!= null && l2 !=null ){
            int val = l1.val + l2.val  + carry ; 
            if( val >9 ){
                int last = val %10 ; 
                carry = val/10 ; 
                ListNode nxt = new ListNode(last) ; 
                curr.next = nxt ; 
    

            }else{
                ListNode rr = new ListNode(val) ; 
                curr.next = rr ; 
                carry = 0 ; 
               
            }
              curr = curr.next ;
              l1 = l1.next ; 
              l2 = l2.next ;
        }
        while( l1 != null ){
            int val = l1.val +carry ; 
             if( val >9 ){
                int last = val %10 ; 
                carry = val/10 ; 
                ListNode nxt = new ListNode(last) ; 
                curr.next = nxt ; 
    

            }else{
                ListNode rr = new ListNode(val) ; 
                curr.next = rr ; 
                carry = 0 ; 
                // break ; 
               
            }
            l1 = l1.next ; 
              curr = curr.next ;

        }
        while( l2 != null ){
            int val = l2.val +carry ; 
             if( val >9 ){
                int last = val %10 ; 
                carry = val/10 ; 
                ListNode nxt = new ListNode(last) ; 
                curr.next = nxt ; 
    

            }else{
                ListNode rr = new ListNode(val) ; 
                curr.next = rr ; 
                carry = 0 ; 
                // break ; 
               
            }
            l2 = l2.next ; 
              curr = curr.next ;

        }
        if( carry > 0 ){
            ListNode  ne = new ListNode( carry) ; 
            curr.next = ne ; 

        }
        return dummy.next ; 
        
    }
}