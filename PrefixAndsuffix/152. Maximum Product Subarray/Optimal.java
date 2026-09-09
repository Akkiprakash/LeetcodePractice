package PrefixAndsuffix.152. Maximum Product Subarray;

class Solution {
    public int maxProduct(int[] nums) {
        int length =nums.length;
        int prefix =1,suffix=1;
        int max = Integer.MIN_VALUE;
       for(int i=0;i<length;i++){

        if(prefix == 0) prefix =1;
        if(suffix ==0) suffix =1;

        prefix = prefix * nums[i];
        suffix = suffix * nums[length-1-i];
        max = Math.max(max,Math.max(suffix,prefix));
       }
       return max;
    }
}
public class Optimal {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = [2,3,-2,4];
        int ans = sol.maxProduct(nums);
        System.out.println(ans);
    }
}
