package leetcodearrays;

class Solution1 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
public class ConcatinatonOfArrays {
    public static void main(String[] args) {

        Solution1 sol = new Solution1();
        int[] nums = {1,2,1};
        int[] result = sol.getConcatenation(nums);
        for(var x : result){
            System.out.print(x + " ");
        }
    }
    
}
