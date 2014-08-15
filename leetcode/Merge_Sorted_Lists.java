public class Merge_Sorted_Lists {

   public static void main(String[ ] args){


   }

   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode retHead  = null;
      ListNode l1Pos = l1;
      ListNode l2Pos = l2;
      ListNode curPos = retHead;

      if( l1 == null)
         return l2;
      else if( l2 == null)
         return l1;

      if(l1Pos.val<l2Pos.val){
         curPos = new ListNode(l1Pos.val);
         l1Pos = l1Pos.next;
      }
      else {
         curPos = new ListNode(l2Pos.val);
         l2Pos = l2Pos.next;
      }

      while(l1Pos!=null && l2Pos!=null){
         if(l1Pos.val<l2Pos.val){
            curPos.next = new ListNode(l1Pos.val);
            curPos = curPos.next;
            l1Pos = l1Pos.next;
         }
         else {
            curPos.next = new ListNode(l2Pos.val);
            curPos = curPos.next;
            l2Pos = l2Pos.next;
         }
      }
      if( l1Pos !=null)
         curPos.next = l1Pos;
      else if( l2Pos!=null)
         curPos.next = l2Pos;

      return retHead;
   }

   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
}
