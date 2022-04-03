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

import java.util.Scanner;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 */
public class Lc680 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String s1 = s.nextLine();
            System.out.println(validPalindrome(s1));
        }
    }

    private static boolean isValid(String s, int i) {
        StringBuilder stringBuilder = new StringBuilder(s.substring(0, i) + s.substring(i + 1));
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }


    public static boolean validPalindrome(String s) {
        // 考虑双指针
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return true;
        }
        // 需要删除一个字符判定是不是回文字符
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isValid(s, i ) || isValid(s, j );
            }
        }
        return true;
    }
}
