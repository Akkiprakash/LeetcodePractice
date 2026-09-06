package Arrrays.Maximum Product of Two Elements in an Array;

class Solution {
    public int maxProduct(int[] nums) {
        int max1 =0,max2=0;

        for(int num : nums){
            if(num > max1){
                max2 = max1;
                max1 =num;
            }
            else if(num > max2){
                max2 = num;
            }
        }
        return (max1-1)*(max2-1);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 4, 5, 2};
        int result = solution.maxProduct(nums);
        System.out.println("Maximum product of two elements in the array: " + result);
    }
}
