package middle;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 4/4/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个字符串 s 和一个字符串数组 dictionary ，找出并返回 dictionary 中最长的字符串，该字符串可以通过删除 s 中的某些字符得到
 */
public class Lc524 {

    public static void main(String[] args) {

        String s = "abce";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("abe");
        dictionary.add("abc");

        System.out.println(findLongestWord(s, dictionary));

    }

    public static String findLongestWord(String s, List<String> dictionary) {
        String re = "";
        // 对dictionary中每个元素进行循环，并判定该字符串是不是存在于s中
        for (int i = 0; i < dictionary.size(); i++) {
            if (isPart(s, dictionary.get(i)) &&
                    dictionary.get(i).length() > re.length() ||
                    (dictionary.get(i).length() == re.length() &&
                            dictionary.get(i).compareTo(re) < 0)) {
                re = dictionary.get(i);
            }
        }
        return re;
    }

    private static boolean isPart(String s, String str) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < str.length()) {
            if (str.charAt(j) == s.charAt(i)) {
                j++;
            }
            i++;
        }
        return j == str.length();
    }
}
