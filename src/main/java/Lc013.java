/**
 * @author WawaGuess
 * @project leecode
 * @Date 1/3/22
 * @UseFor
 * @Attention
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
