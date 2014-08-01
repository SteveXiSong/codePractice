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
 
/*to handle the previous head is crucial to this problem
*/

public class Solution {
    public ListNode insertionSortList(ListNode head) {
       ]
        if(head == null || head.next == null)
            return head;
            
        ListNode fakeHead = new ListNode(Integer.MIN_VALUE);
        ListNode current = head;
        
        while(current != null){
            ListNode next = current.next;
            ListNode prev = fakeHead;
            
            //find out the inserting position
            while(prev.next != null && prev.next.val <current.val)
                prev = prev.next;
                
            //insert into the sorted part    
            current.next = prev.next;
            prev.next = current;
            
            current = next;
        }
        
        return fakeHead.next;
    }
}
