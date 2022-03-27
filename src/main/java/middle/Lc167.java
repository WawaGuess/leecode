package middle;


/**
 * @author WawaGuess
 * @project leecode
 * @Date 3/27/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */


/**
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc167 {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};

        int target = 9;
        System.out.println(twoSum(numbers, target)[0]);
    }


    /**
     * 使用双指针，分别从前后同时开始
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int last = numbers.length - 1;
        for (int begin = 0; begin < last; ) {

            if (numbers[begin] + numbers[last] == target) {
                return new int[]{begin + 1, last + 1};
            } else if (numbers[begin] + numbers[last] > target) {
                last--;
            } else {
                begin++;
            }
        }
        return null;
    }


    /**
     * 使用双层for循环
     * 最终结果测试例通过，但是超时了
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
