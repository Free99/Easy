package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        return next;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = head, pre = dummy;
        dummy.next = head;
        while (cur != null && cur.next != null) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
