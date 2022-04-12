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


/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Lc344 {

    public static void main(String[] args) {

        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};

        reverseString(s);
        System.out.println(s[0]);


    }

    public static void reverseString(char[] s) {
        int begin = 0;
        int end = s.length - 1;
        char temp;
        while (begin != end && begin < end) {
            temp = s[begin];
            s[begin] = s[end];
            s[end] = temp;
            begin++;
            end--;
        }
    }
}
