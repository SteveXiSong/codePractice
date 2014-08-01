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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode nextHead=head;
        ListNode thisHead=head;
        ListNode prevHead=head;
        boolean flag =false;
        int globalflag=0;
        while(thisHead!=null && thisHead.next!=null){
        	nextHead=thisHead.next;
        	flag=false;
        	while(nextHead.val==thisHead.val){
        		flag = true;
        		nextHead=nextHead.next;
        		if(nextHead==null) break;
        	}
        	if(flag==true) {
        	    if(thisHead==head)
        	        head=nextHead;
        		prevHead.next = nextHead;
        		thisHead=nextHead;
        	}
        	else {
        		prevHead=thisHead;
        		thisHead=nextHead;
        	}
        }
    	return head;
    }
}
