import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Store all values
        for (ListNode list : lists) {

            while (list != null) {
                arr.add(list.val);
                list = list.next;
            }
        }

        // Sort
        Collections.sort(arr);

        // Create linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}