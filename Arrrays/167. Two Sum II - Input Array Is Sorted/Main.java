package Arrrays.167. Two Sum II - Input Array Is Sorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
    // using the two pointers 
    int i=0,j=numbers.length-1;
    int[] ans = new int[2];
    while(i<j){
        int sum = numbers[i] + numbers[j];
        if(sum == target){
            ans[0] = i+1;
            ans[1] = j+1;
            break;
        }
        else if (sum > target){
            j--;
        }else{
            i++;
        }
    }
    return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int target =9;
        int[] nums = [2,7,11,15];
        int[] ans = sol.twoSum(nums,target);
        for(int an : ans ){
            System.out.print(an + " ");
        }
    }
}
