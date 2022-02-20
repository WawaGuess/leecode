package simple;

/**
 * @author WawaGuess
 * @project leecode
 * @Date 2/20/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */


import com.sun.org.apache.bcel.internal.util.BCELifier;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 */
public class Lc027 {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 2, 2, 3};

        int val = 3;

        int i = removeElement(nums, val);

        System.out.println(i);
    }


    /**
     * 因为要原地删除数组中的元素，可以理解为，如果当前元素是目标元素，则用后面的不是目标元素的进行替代
     * <p>
     * 难点是怎么找到后面不是目标元素，可以使用双指针，第一个指针指向当前元素，第二指针用于查找不是目标元素
     *
     * @param nums
     * @param val
     * @return
     */


    public static int removeElement(int[] nums, int val) {

        // 现对输入的数组长度进行预判,这里不能排除长度为1的情况，因为val可能就是数组中唯一的元素

        if (nums.length == 0) {
            return nums.length;
        }

        // 双指针进行数据删除，第一个指针同时作为返回值
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] != val) {

                nums[left] = nums[right];

                left++;
            }
        }
        return left;
    }
}
