import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && map.get(need) != i) {
                return new int[] { i, map.get(need) };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
