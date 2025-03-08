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
public class Lc2511 {

    public static void main(String[] args) {

        int[] forts = new int[]{1, 0, 0, -1, 0, 0, -1, 0, 0, 1};
        System.out.println(captureForts(forts));

    }


    public static int captureForts(int[] forts) {
        int max = 0;

        for (int mov = 0, pos = 0; mov < forts.length; mov++) {
            if (forts[mov] == 1 && forts[pos] == -1) {
                max = Math.max(max, mov - pos - 1);
                pos = mov;
            } else if (forts[mov] == 1) {
                pos = mov;
            } else if (forts[mov] == -1 && forts[pos] == 1) {
                max = Math.max(max, mov - pos - 1);
                pos = mov;
            } else if (forts[mov] == -1) {
                pos = mov;
            }
        }
        return max;
    }
}
