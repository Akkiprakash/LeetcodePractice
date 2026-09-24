class Solution {
    public int smallestIndex(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length;i++){
            int num = nums[i];
            int sum =0;
            while(num > 0){
                //digit
                sum +=  num % 10;
                num = num/10;
                if(sum > i){
                    break;
                }
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {18, 43, 36, 13, 7};
        int ans = sol.smallestIndex(nums);
        System.out.println(ans);
    }
}
