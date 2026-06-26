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
    public static ListNode merge(ListNode a , ListNode b ){
        ListNode dummy  = new ListNode(0) ;

        ListNode curr =new ListNode(0) ; 
        dummy.next  = curr ; 
          while( a!= null && b!= null ){
            if( a.val <= b.val){
                
                curr.next = a ; 
                a = a.next ; 
                curr = curr.next ; 
            }else{
            
                curr.next = b ; 
                b = b.next ; 
                curr = curr.next ; 
            }
          }
          if ( a != null ){
            curr.next = a ; 
            curr = curr.next ; 
          }
          if ( b != null ){
            curr.next = b ; 
            curr = curr.next ; 
          }
          return dummy.next.next  ; 
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      return   merge(list1 , list2) ; 
        
    }
}