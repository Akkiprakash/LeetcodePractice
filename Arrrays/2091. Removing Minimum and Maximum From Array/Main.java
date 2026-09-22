

class Solution {
    public int minimumDeletions(int[] nums) {
        int length = nums.length;
        int minIndex =0;
        int maxIndex =0;

        for(int i=1;i<length;i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        //simple 
        //checking from the left possible
        int left = Math.max(minIndex, maxIndex) + 1;

        int right = length - Math.min(minIndex, maxIndex);

        int both = Math.min(
    minIndex + 1 + (length - maxIndex),
    maxIndex + 1 + (length - minIndex));
        return Math.min(left,Math.min(right,both));
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,10,7,5,4,1,8,6};
        int ans = sol.minimumDeletions(nums);  
        System.out.println(ans);
    }
    
}
