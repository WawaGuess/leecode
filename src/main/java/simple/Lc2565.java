package simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * @author WawaGuess
 * @project leecode
 * @Date 2025/3/1
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */

/**
 * 给你一个下标从 0 开始长度为 偶数 的整数数组 nums 。
 * <p>
 * 只要 nums 不是 空数组，你就重复执行以下步骤：
 * <p>
 * 找到 nums 中的最小值，并删除它。
 * 找到 nums 中的最大值，并删除它。
 * 计算删除两数的平均值。
 */
public class Lc2565 {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 4, 0, 3, 5};

        System.out.println(distinctAverages(nums));
    }


    public static int distinctAverages(int[] nums) {
        // 先进行排序
        Arrays.sort(nums);
        Set<Integer> result = new HashSet<>();
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            result.add(nums[i] + nums[j]);
        }

        return result.size();
    }

}
