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


class Solution {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode curP,preP,nextP,beginP,endP,afterEndP,beforeBeginP;
        beforeBeginP=afterEndP=curP=preP=nextP=head;   //all pointed to the head
        int k;
        for(k=1;k<m;k++){
            beforeBeginP=curP;  //the node before beginP
            curP=curP.next; //
        }
        beginP=curP;
        afterEndP=curP;
        for(;k<n;k++){
            curP=curP.next;
            afterEndP=curP.next;
        }
        endP=curP;
        
        if(beginP.next != null){
            curP=preP=nextP=beginP;
            nextP=curP.next;
            while(curP!=endP){
                preP=curP;
                curP=nextP;
                nextP=curP.next;
                
                curP.next=preP;

            }
            if(beforeBeginP != beginP)
            	beforeBeginP.next=endP;
            if(afterEndP!=endP)
            	beginP.next=afterEndP;
            if(m==1)
            	head = endP;
        }
       
        return head;
    }
}
