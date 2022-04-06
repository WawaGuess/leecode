package simple;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 4/5/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */

import java.util.Scanner;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 */
public class Lc202 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = Integer.parseInt(s.nextLine());

            System.out.println(isHappy(i));

        }
    }

    /**
     * 快乐数的查询原理是怎么判定进入了死循环，
     *  1.死循环的判定类似于环形列表的判断，采用快慢指针进行，如果一直循环则，快指针会追上慢指针，作为整个循环结束条件
     *  2.陷入死循环，表明之前出现过的值又重新出现了，可以采用set集合来进行重复判断，重复来表明死循环
     * @param n
     * @return
     */
    public static boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            fast = getSum(fast);
            slow = getSum(slow);
            fast = getSum(fast);
        } while (fast != slow);

        if (fast == 1) {
            return true;
        }
        return false;
    }

    private static int getSum(int slow) {
        int re = 0;
        while (slow != 0) {
            re += (slow % 10) * (slow % 10);
            slow /= 10;
        }
        return re;
    }
}
