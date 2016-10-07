package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode walker = head;
        ListNode runner = head;
        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            walker = walker.next;
        }

        // odd situation
        if (runner != null) walker = walker.next;
        walker = reverse(walker);
        while (walker != null && walker.val == head.val) {
            walker = walker.next;
            head = head.next;
        }
        return walker == null;
    }

    private ListNode reverse(ListNode head) {
        ListNode dummy = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
    }
}
