
class Solution {
    public long maxAlternatingSum(int[] nums) {
       
       for(int i=0;i<nums.length;i++){
        nums[i] = nums[i] * nums[i];
       }
       //retrun the squared array
       Arrays.sort(nums);
       int i=0;int j= nums.length-1;
       long evensum=0,oddsum=0;
       while(i<=j){
        evensum += nums[j--];
        if(i<=j){
            oddsum += nums[i++];
        }
       }
       return (evensum-oddsum);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4,2,5,3};
        long ans = sol.maxAlternatingSum(nums);
        System.out.println(ans);
    }   
    
    
}
