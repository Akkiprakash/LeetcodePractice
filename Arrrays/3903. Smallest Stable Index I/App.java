
class Solution {
    public int firstStableIndex(int[] nums, int h) {
        int length = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        int i =0;
        int j = length-1;

        if(nums.length == 1) return h;
        while(i<length && j>=0){
             max = Math.max(nums[i],max);
             prefix[i] = max;
            min = Math.min(nums[j],min);
            suffix[j] = min;
            i++;
            j--;
        }
        for(int k=0; k < length;k++){
            int ans = prefix[k] - suffix[k];
            if(ans <= h){
                return k;
            }
        }
        return -1;
    }
}

public class App {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2, 4, 5 };
        int h = 2;
        int result = solution.firstStableIndex(nums, h);
        System.out.println("The first stable index is: " + result);
    }
}
