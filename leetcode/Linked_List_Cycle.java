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
/**
 * fast and slow check
 * fast will go ove the slow node,
 * then there is  a cycle
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowNode,fastNode1, fastNode2;
        slowNode=fastNode1=fastNode2=head;
        while(slowNode!=null && ((fastNode1 = fastNode2.next)!=null) && ((fastNode2 = fastNode1.next)!=null) ){
            if(slowNode == fastNode1 || slowNode == fastNode2)
                return true;
            slowNode = slowNode.next;
        }
        return false;
    }
}
