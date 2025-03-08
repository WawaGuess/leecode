package simple;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 2025/3/8
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */
public class Lc1455 {

    public static void main(String[] args) {


        String sentence = "i am tired";
        String searchWord = "you";
        System.out.println(isPrefixOfWord(sentence, searchWord));

    }

    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] split = sentence.split(" ");

        for (int i = 0; i < split.length; i++) {
            String sp = split[i];
            if (sp.startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
