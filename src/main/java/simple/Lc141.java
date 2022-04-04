package simple;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 4/3/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */

/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 */
public class Lc141 {

    public static void main(String[] args) {

        ListNode listNode0 = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(-4);

        // 3的地址重新指向了1，此时形成一个环
        listNode3.next = listNode1;
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        listNode0.next = listNode1;

        System.out.println(hasCycle(listNode0));

    }


    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
