package PrefixAndsuffix.152. Maximum Product Subarray;

class Solution {
    public int maxProduct(int[] nums) {
       int length = nums.length;
       int max = Integer.MIN_VALUE;
       if(nums.length == 1) return nums[0];
       for(int i=0;i<length;i++){
            int product =1;
        for(int j=i;j<length;j++){
            product *= nums[j]; 
            // if(product == 0){
            //     break;
            // }
            max = Math.max(max,product);
        }
       }
       return max;
    }
}

public class Brute {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = [2,3,-2,4];
        int ans = sol.maxProduct(nums);
        System.out.println(ans);
    }
}
