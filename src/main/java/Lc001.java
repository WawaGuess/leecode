import java.util.HashMap;
import java.util.Map;

/**
 * @author GuessHat
 * @project leecode
 * @Date 12/12/21
 * @UseFor
 */
public class Lc001 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target  = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res);
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
