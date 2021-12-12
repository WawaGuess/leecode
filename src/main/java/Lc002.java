/**
 * @author GuessHat
 * @project leecode
 * @Date 12/12/21
 * @UseFor
 */
public class Lc002 {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        l1.next = new ListNode(4);
        l2.next = new ListNode(6);

        ListNode listNode = addTwoNumbers(l1, l2);

        System.out.println(listNode);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        // dump 作为最终结果的返回值
        ListNode dump = new ListNode(0);

        // head作为每次深入的ListNode,因为每个ListNode都有next属性
        ListNode head = dump;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int sum = val1 + val2 + carry;


            // head指向的是dump的地址，在赋值时对应修改了dump中的值
            head.next = new ListNode(sum % 10);
            // 修改了当前dump的内容，然后将地址指向dump的next属性的地址
            head = head.next;

            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }
        return dump.next;

    }


    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}





