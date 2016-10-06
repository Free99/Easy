package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        dummy.next = l1;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1 = l1.next;
            } else {
                ListNode next = l2.next;
                cur.next = l2;
                l2.next = l1;
                l2 = next;
            }
            cur = cur.next;
        }
        if (l1 == null) cur.next = l2;
        return dummy.next;
    }
}
