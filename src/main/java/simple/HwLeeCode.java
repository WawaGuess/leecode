package simple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 3/18/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */


/**
 * 输入一个字符串，字符串由数字组构成，找出相同数字构成的所有自我字符串的个数
 * <p>
 * 案例1：
 * 输入"11121"
 * 输出 8
 * <p>
 * 案例2：
 * 输入"6666666666"
 * 输出55
 */
public class HwLeeCode {


    public static void main(String[] args) {
        String str = "6666666666";

        System.out.println(getResult(str));
    }


    public static int getResult(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return str.length();
        }

        StringBuilder re = new StringBuilder();
        Map<Integer, String> res = new HashMap<>();


        char[] chars = str.toCharArray();

        re.append(chars[0]);
        int num = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                re.append(chars[i]);
            } else {
                res.put(num++, re.toString());
                re.delete(0, re.length());
                re.append(chars[i]);
            }
        }
        res.put(num++, re.toString());

        Iterator<String> iterator = res.values().iterator();

        int sum = 0;

        while (iterator.hasNext()) {
            sum += getSum(iterator.next().toCharArray().length);

        }

        return sum;

    }

    private static int getSum(int length) {

        if (length == 1) {
            return 1;
        }
        return length + getSum(length - 1);
    }

}
