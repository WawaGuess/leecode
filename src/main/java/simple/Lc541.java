package simple;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 2025/3/1
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */


/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * <p>
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */
public class Lc541 {

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseStr(s, 2));

    }

    public static String reverseStr(String s, int k) {

        int length = s.length();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < length; i += 2 * k) {
            reverse(charArray, i, Math.min(i + k, length) - 1);
        }
        return new String(charArray);
    }

    private static void reverse(char[] charArray, int left, int right) {
        while (left < right) {
            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
            left++;
            right--;
        }

    }
}
