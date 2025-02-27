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
        ListNode result = new ListNode(0);
        ListNode tempRef = result;
        int carry = 0;
        int sum = 0;
        int remaining = 0;

        while (l1 != null || l2 != null || carry != 0)
        {
            sum = carry;

            if(l1 != null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2 != null)
            {
                sum+=l2.val;
                l2=l2.next;
            }

            carry = sum / 10;
            remaining = sum % 10;

            tempRef.next = new ListNode(remaining);
            tempRef = tempRef.next;
        }

        return result.next;
    }
}
