package simple;

/*
 * @author WawaGuess
 * @project leecode
 * @Date 4/13/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 */
public class Lc349 {

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        //判断两个数组的大小，减少循环次数

        return nums1.length > nums2.length ? getResult(nums1, nums2) : getResult(nums2, nums1);
    }

    private int[] getResult(int[] nums1, int[] nums2) {
        LinkedHashSet results = new LinkedHashSet();

        for (int num1 :nums1) {
            for (int num2: nums2) {
                if (num1 == num2) {
                    results.add(num1);
                    break;
                }
            }

        }

        int[] result = new int[results.size()];
        Iterator<Integer> iterator = results.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            result[i] = iterator.next();
            i++;
        }
        return result;
    }


}