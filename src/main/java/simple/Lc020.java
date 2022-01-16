package simple;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 1/3/22
 * @UseFor
 * @Attention
 */


/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc020 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        while (s.hasNextLine()) {
            String s1 = s.nextLine();

            System.out.println(isValid(s1));

//            System.out.println( isValidByList("s1"));


        }
    }

    public static boolean isValid(String s) {

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {

            if (s.contains("()")) {
                s = s.replace("()", "");
            }

            if (s.contains("[]")) {
                s = s.replace("[]", "");
            }

            if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
        }
        return s.length() == 0;
    }

    /**
     * 方法二: 利用堆栈思想，采用list的方式进行处理
     * 题目目的是为了匹配完整括号，
     * 正向括号时直接放入LinkedList中，
     * 出现反向括号时进行处理，去匹配list中最后一个字符是否相匹配，匹配的话进行删除，否则直接返回false
     * 当传入的字符已经处理完毕，如果list为空，则表示全部匹配，否则表示有多余字符，返回false,简化为
     * list.size() == 0
     *
     * @param s
     * @return
     */
    public static boolean isValidByList(String s) {

        List<Character> list = new LinkedList<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                if (list.isEmpty() || !isMath(chars[i], list)) {
                    return false;
                } else {
                    list.remove(list.size() - 1);
                }

            } else {
                list.add(chars[i]);
            }
        }
        return list.size() == 0;
    }

    private static boolean isMath(char aChar, List<Character> list) {
        switch (aChar) {
            case ')':
                return (list.get(list.size() - 1) == '(') ? true : false;
            case ']':
                return (list.get(list.size() - 1) == '[') ? true : false;
            case '}':
                return (list.get(list.size() - 1) == '{') ? true : false;
            default:
                return false;

        }

    }


}
