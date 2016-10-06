package Easy;

/**
 * Created by Tianshan on 10/5/16.
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
