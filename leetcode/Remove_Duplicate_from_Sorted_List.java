 /* Definition for singly-linked list.*/
 
public class Remove_Duplicate_from_Sorted_List {
   public static void main (String [] args){
      ListNode head = new ListNode(1);
      head.next =new ListNode(1);
      /*
      head.next = new ListNode(2);
      head.next.next = new ListNode(2);
      head.next.next.next = new ListNode(3);
      */

      for( ListNode it = head; it!=null; it=it.next)
         System.out.print(it.val+" ");

      deleteDuplicates(head);

      for( ListNode it = head; it!=null; it=it.next)
         System.out.print(it.val+" ");
   }

   public static ListNode deleteDuplicates(ListNode head) {
      ListNode curPos = head;
      ListNode nextPos = head;
      boolean is_dup = false;

      if(head == null)
         return head;
      if(head.next == null)
         return head;

      nextPos = curPos.next;
      while(curPos.next != null || curPos == null){
         System.out.println("here");
         while(curPos.val == nextPos.val){
           is_dup = true;
            if(nextPos.next != null)
               nextPos = nextPos.next;
            else{
               nextPos = null;
               break;
            }
         }
         if(is_dup = true){
            curPos.next = nextPos;
         }
         if(curPos.next!=null){
            curPos = curPos.next;
            nextPos = curPos.next;
         }
      }

     return head;
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
