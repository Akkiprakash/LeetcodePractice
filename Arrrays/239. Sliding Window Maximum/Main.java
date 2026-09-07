package Arrrays.239. Sliding Window Maximum;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[length-k+1];

        int left= 0,right=0,index=0;
        while(right<length){
            list.add(nums[right]);
            if(right-left+1 == k){
                int max = Integer.MIN_VALUE;
                for(int ls : list){
                    max = Math.max(ls,max);
                }
                arr[index++] = max; 
            // if excceds k
            //removing the left
            list.remove(Integer.valueOf(nums[left]));
            left++;
            }
            right++;
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
         int [] result = sol.maxSlidingWindow(nums, k);
        System.out.println("Sliding window maximums: " + Arrays.toString(result));
    }
}
