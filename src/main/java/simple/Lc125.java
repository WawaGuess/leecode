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
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class Lc125 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String s1 = s.nextLine();

            System.out.println(isPalindrome(s1));
        }

    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        //1.将字符串转换成数组
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        //2.验证是否是回文字符，用到双指针，前后同时判断
        while (i <= j) {
            if (isIllleager(chars[i], chars[j])) {
                if ((Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j]))) {
                    return false;
                }
                i++;
                j--;
            } else if (!isIllleager(chars[i], '0')) {
                i++;
            } else if (!isIllleager(chars[j], '0')) {
                j--;
            }
        }
        return true;
    }

    private static boolean isIllleager(char chari, char charj) {
        if (Character.isDigit(chari) || Character.isLetter(chari)) {
            if (Character.isDigit(charj) || Character.isLetter(charj)) {
                return true;
            }
        }
        return false;
    }
}
