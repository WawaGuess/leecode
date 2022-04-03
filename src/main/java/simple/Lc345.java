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
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 * <p>
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现
 */

public class Lc345 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String s1 = s.nextLine();
            System.out.println(reverseVowels(s1));

        }

    }

    public static String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        char tmp;
        while (i < j) {
            if (isVowels(chars[i]) && isVowels(chars[j])) {
                tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            } else if (isVowels(chars[i])) {
                j--;
            } else {
                i++;
            }
        }
        return String.valueOf(chars);
    }

    private static boolean isVowels(char aChar) {
        char c = Character.toLowerCase(aChar);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
