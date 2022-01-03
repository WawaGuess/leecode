
import java.util.Scanner;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 1/3/22
 * @UseFor
 * @Attention
 */
public class Lc020 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        while (s.hasNextLine()) {
            String s1 = s.nextLine();

            System.out.println(isValid(s1));


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

}
