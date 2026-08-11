package RecursionPractice;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result =  new ArrayList<>();
      helperfunction(0,nums,result);
      return result;
    }
    private static void helperfunction(int idx,int[] arr,List<List<Integer>> res){
        if(idx == arr.length){
            res.add(new ArrayList<>());
            return;
        }
        // function call
        helperfunction(idx+1,arr,res);
        int size = res.size();
        for(int i=0;i<size;i++){
            List<Integer> cur = new ArrayList<>(res.get(i));
            cur.add(arr[idx]);
            res.add(cur);
        }
    }
}
public class subsets{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,3};
        List<List<Integer>> ans = s.subsets(arr);
        System.out.println(ans);
    }

}