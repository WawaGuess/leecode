/**
 * @author GuessHat
 * @project leecode
 * @Date 12/12/21
 * @UseFor
 */

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
 * <p>
 * 输入为三个整数：day、month 和 year，分别表示日、月、年。
 * <p>
 * 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/day-of-the-week
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc1185 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] dates = line.split(",");
            int day = Integer.parseInt(dates[0]);
            int month = Integer.parseInt(dates[1]);
            int year = Integer.parseInt(dates[2]);

            System.out.println(dayOfTheWeek(day, month, year));

        }
    }


    public static String dayOfTheWeek(int day, int month, int year) {
        if (checkParams(day, month, year)) {
            LocalDate localDate = LocalDate.of(year, month, day);
            String[] ss = {null, "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return ss[localDate.getDayOfWeek().getValue()];
        }
        return "Wrong input params,Pls input again";

    }

    private static Boolean checkParams(int day, int month, int year) {

        if (0 < day && day < 32 && 0 < month && month < 13 && 1970 < year && year < 2101) {
            return true;
        }
        return false;

    }
}
