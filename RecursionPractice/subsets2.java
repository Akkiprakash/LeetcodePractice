package RecursionPractice;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helperfunction(0,nums,ans,result);
        return result;
    }
    private void helperfunction(int index,int[] arr,List<Integer> ans,List<List<Integer>> result){
        //base case
        if(index >= arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        // function 
        ans.add(arr[index]);
        helperfunction(index+1,arr,ans,result);
        // removing 
        ans.remove(ans.size()-1);
        //skipping duplicates
        while(index+1 < arr.length && arr[index] == arr[index+1]){
            index++;
        }
        //backtracting
        helperfunction(index+1,arr,ans,result);
    }
}
public class subsets2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,2};
        List<List<Integer>> ans = s.subsetsWithDup(arr);
        System.out.println(ans);
    }
    
}
