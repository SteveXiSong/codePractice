class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 
//public class Solution {
public class Sort_List {
    public static ListNode sortList(ListNode head) {

        if( head == null || head.next == null)
            return head;
        int lenList = 0; // to record the length of the list
        ListNode curPos = head;
        
        //to iterate for length
        while(curPos!=null){
            lenList++;
            curPos = curPos.next;
        }

        //if the length is 2
        //no need

        //otherwise divide and merge
        ListNode secHead = null;
        ListNode leftHead, rightHead;
        
        leftHead = rightHead = head;
        int i=0;

        //break the list into half
        curPos = head;
        while(curPos.next != null){
            i++;
            if(i+1 >lenList/2){
                rightHead = curPos.next;
                curPos.next = null;
                break;
            }
            curPos = curPos.next;
        }

        //divide and merge
        assert(leftHead !=  rightHead);
        ListNode sortedLeft  = sortList(leftHead);
        ListNode sortedRight = sortList(rightHead);
        ListNode retHead = merge(sortedLeft, sortedRight);

        return retHead;
    }

    public static ListNode merge(ListNode leftHead, ListNode rightHead){
      ListNode retHead = null; 
      ListNode leftIt = leftHead;
      ListNode rightIt = rightHead;
      ListNode retTail = retHead;

      while( leftIt != null && rightIt != null){
         //the ret List is empty
         if(retHead ==null){
            if(leftIt.val < rightIt.val){
               retHead = new ListNode(leftIt.val);
               leftIt = leftIt.next;
            }
            else {
               retHead = new ListNode(rightIt.val);
               rightIt = rightIt.next;
            }
            retTail = retHead;
         }
         //the return list is not empty
         else{
            if(leftIt.val < rightIt.val){
               retTail.next = new ListNode(leftIt.val);
               leftIt = leftIt.next;
            }
            else {
               retTail.next = new ListNode(rightIt.val);
               rightIt = rightIt.next;
            }
            assert retTail.next != null;
            retTail = retTail.next;
         }
      }

      if(leftIt == null){
         retTail.next = rightIt;
      }
      else if(rightIt ==null){
         retTail.next = leftIt;
      }

      return retHead;
   }


   public static void main(String [] args){
      ListNode head = new ListNode(0);
      head.next = new ListNode(2);
      head.next.next = new ListNode(1);
      head.next.next.next = new ListNode(3);

      for(ListNode it = head; it != null; it = it.next)
         System.out.print( it.val+",");
      System.out.println();

      //ListNode sortHead = sortList(head);
      ListNode sortHead = sortList(null);

      for(ListNode it = sortHead; it != null; it = it.next)
         System.out.print( it.val+",");
      System.out.println();

   }
}
