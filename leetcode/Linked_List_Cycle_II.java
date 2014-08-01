/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
           ListNode slowNode, fastNode_1;
           //check next and next.next to be null
	        if(head == null||head.next ==null||head.next.next==null) return null;
	        slowNode = fastNode_1 = head;
	        //next and next.next must be checked, to ensure no nullPtrException
	        while(fastNode_1!=null&&fastNode_1.next!=null&&fastNode_1.next.next!=null){ 
	            //in case of start matching
	            fastNode_1=fastNode_1.next.next;
	            slowNode=slowNode.next;
	            //when fast and slow encouter, fast run L more than slow.
	            //as fast is 2x than slow, the surpassed length fast run equals to the slow's length
	            //hence slow has run the CycleLength length.
	        	if(slowNode == fastNode_1){
	        	    //reset fast and run
	        	    //encouter are the start point.
	                fastNode_1=head;
	                while(slowNode!=fastNode_1){
	                    slowNode=slowNode.next;
	                    fastNode_1=fastNode_1.next;
	                }
	                return slowNode;
	            }
	        }
	        return null;
    }
}
