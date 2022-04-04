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

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                if (result > right - left + 1 || result == 0) {
                    result = right - left + 1;
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return result;
    }
}
