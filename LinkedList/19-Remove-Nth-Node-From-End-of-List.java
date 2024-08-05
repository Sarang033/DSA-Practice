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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        //finding the gap
        while(n>0 && second!=null){
            second = second.next;
            n--;
        }
        if(second == null){
            if(n>0){
                return head;
            }
            else{
                ListNode temp=head;
                head=head.next;
                temp.next = null;
                return head;
            }
        }

        ListNode prev = null;
        if(second != null){
            while(second!=null){
                prev = first;
                first=first.next;
                second=second.next;
            }
            //deletion of nth node from end
            prev.next = first.next;
            first.next = null;
        }
        return head;
    }
}