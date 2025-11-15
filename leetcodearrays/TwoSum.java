package leetcodearrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int right = nums.length;
        result[0] = 0;
        result[1] = 1;
        for (int i = 0; i < right; i++) {
            for (int j = i + 1; j < right; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
