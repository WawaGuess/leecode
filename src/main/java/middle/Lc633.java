package middle;

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


import java.util.Scanner;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a的平方b的平方等于c。
 */
public class Lc633 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int i = s.nextInt();
            System.out.println(judgeSquareSum(i));
        }


    }

    public static boolean judgeSquareSum(int c) {
        if (c == 0 || c == 1) {
            return true;
        }
        // 降低时间复杂度
        int j = (int) Math.sqrt(c) + 1;
        for (int i = 0; i <= j; ) {
            if (Math.pow(i, 2) + Math.pow(j, 2) == c) {
                return true;
            } else if (Math.pow(i, 2) + Math.pow(j, 2) > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
