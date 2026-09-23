
class Solution {
    public int minOperations(int[] nums, int x) {
        int length = nums.length;
        int total = 0, target = 0;
        for (int num : nums) {
            total += num;
        }
        target = total - x;

        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return length;
        }
        //using the sliding window 
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < length; right++) {
            sum += nums[right];

            while(sum > target) {
                sum -= nums[left];
                left++;
            }
            if (sum == target) {
                //finding the max window size
                max = Math.max(max, right - left + 1);
            }
        }
        return max == Integer.MIN_VALUE ? -1 : length - max;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,4,2,3};
        int x = 5;  
        int ans = sol.minOperations(nums, x);
        System.out.println(ans);
    }
}
