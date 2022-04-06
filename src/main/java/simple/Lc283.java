package simple;


/**
 * @author WawaGuess
 * @project leecode
 * @Date 4/6/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class Lc283 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1};
        moveZeroes(nums);

    }


//    public static void moveZeroes(int[] nums) {
//        int[] res = new int[nums.length];
//        for (int i = 0, j = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                res[j] = nums[i];
//                j++;
//            }
//        }
//        for (int i = 0; i < res.length; i++) {
//            nums[i] = res[i];
//        }
//    }

    public static void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = 0; i < fast - slow; i++) {
            nums[nums.length - fast + slow + i] = 0;
        }
    }
}
