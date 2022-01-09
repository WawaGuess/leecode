/**
 * @author WawaGuess
 * @project leecode
 * @Date 1/3/22
 * @UseFor
 * @Attention
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 罗马数字转整数
 */
public class Lc013 {

    private static Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String s1 = s.nextLine();
            System.out.println(romanToInt(s1));

        }

    }

    public static int romanToInt(String s) {
        int re = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer value = symbolValues.get(Character.toUpperCase(s.charAt(i)));

            if (i < s.length() - 1 && value < symbolValues.get(Character.toUpperCase(s.charAt(i + 1)))) {
                re -= value;
            } else {
                re += value;
            }

        }
        return re;

    }
}
