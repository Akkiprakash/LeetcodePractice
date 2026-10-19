import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> targetIndices1(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        return ans;
    }
}

public class Approach2 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {1,3,4,5,6,7,3,5};
        int target = 3;
       System.out.println(sol.targetIndices1(nums,target));
    }
}
