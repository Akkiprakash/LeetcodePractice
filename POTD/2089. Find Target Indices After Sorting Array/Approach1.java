import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int smallIndex = 0;
        int targetCount = 0;
       for(int num : nums){
        if(num < target){
            smallIndex++;
        }
        else if(num ==  target){
            targetCount++;
        }
       }
       for(int i=0;i<targetCount;i++){
        ans.add(smallIndex++);
       }
       return ans;
    }
}
public class Approach1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2; 
        List<Integer> ans = sol.targetIndices(nums, target);
        System.out.println(ans);
        
    }
}
