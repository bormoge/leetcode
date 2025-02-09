// First try, didn't work; almost, but not quite. Nevertheless, even if it did it would be too slow.

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
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();

        ListNode result = new ListNode();
        ListNode tempList = new ListNode();

        while(l1 != null && l2 != null)
        {
            if(l1 != null)
            {
                array1.add(String.valueOf(l1.val));
                l1 = l1.next;
            }
            if(l2 != null)
            {
                array2.add(String.valueOf(l2.val));
                l2 = l2.next;
            }
        }

        String s1 = "";
        String s2 = "";

        int j = array1.size() - 1 > array2.size() - 1 ?
        array1.size() - 1 : array2.size() - 1;

        while(j >= 0)
        {
            if(!(array1.size() < j))
                s1 = s1 + array1.get(j);
            if(!(array2.size() < j))
                s2 = s2 + array2.get(j);
            j--;
        }

        int resultSum = Integer.parseInt(s1) + Integer.parseInt(s2);
        String resultString = String.valueOf(resultSum);
        char[] resultChars = resultString.toCharArray();

        int i = resultChars.length-1;
        ListNode result2 = result;

        while(i >= 0)
        {
            result2.val = resultChars[i] - '0';
            result2.next = new ListNode();
            result2 = result2.next;
            i--;
        }

        return result;
    }
}
