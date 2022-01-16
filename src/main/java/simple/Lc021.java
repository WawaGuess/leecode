package simple; /**
 * @author WawaGuess
 * @project leecode
 * @Date 1/16/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */


/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Lc021 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));


        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode listNode = mergeTwoLists1(list1, list2);

        System.out.println(listNode.val);


    }


    /**
     * 方法一
     * 采用递归的方式，每次找出头最小的，然后该ListNode的next再与大的那个ListNode比较
     *
     * @param list1
     * @param list2
     * @return
     */

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }

    }

    /**
     * 方法二
     * 这里的思路主要是利用res和re 初始利用了同一个地址，在一次循环后re指向了res的next地址，
     * 相当于动态更新res的next
     *
     * @param list1
     * @param list2
     * @return
     */

    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {

        ListNode res = new ListNode(-1);

        ListNode re = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                re.next = list1;
                list1 = list1.next;

            } else {
                re.next = list2;
                list2 = list2.next;
            }
            re = re.next;

        }

        re.next = list1 == null ? list2 : list1;


        return re.next;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
