class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum =0;
        int length = nums.size();
    for(int i=0;i<length;i++){
        Set<Integer> set = new HashSet<>();
        for(int j =i;j<length;j++){
            set.add(nums.get(j));
            int value = set.size();
            sum += value * value;
        }
    }
    return sum;
    }
}
public class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = Arrays.asList(1, 2, 3);
        int ans = sol.sumCounts(nums);
        System.out.println(ans);
    }
}