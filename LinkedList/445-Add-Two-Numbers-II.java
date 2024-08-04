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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);
        ListNode temp = new ListNode(0);
        ListNode ans = temp;
        int carry = 0;
        while(list1 != null || list2!=null || carry!=0){
            int sum = 0;
            if(list1!= null){
                sum+=list1.val;
                list1=list1.next;
            }
            if(list2!= null){
                sum+=list2.val;
                list2=list2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode node = new ListNode(sum % 10);
            ans.next = node;
            ans = ans.next;
        }
        ans.next = null;
        temp = temp.next;
        ListNode res = reverse(temp);
        return res;
    }
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode res = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}