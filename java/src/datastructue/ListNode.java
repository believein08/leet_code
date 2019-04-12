package datastructue;

/**
 * Definition for singly-linked list.
 */

public class ListNode {
    private int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }

    public void appendNodes(int[] vals) {
        ListNode cur = this;
        for (int val : vals) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
    }

    public String LinkedListString() {
        StringBuilder result = new StringBuilder();
        ListNode p = this;
        while (p != null) {
            result.append(p.val).append("-");
            p = p.next;
        }
        return result.toString();
    }
}