package leetcodearrays;

class Consecitive{
    public int findMaxConsecutiveOnes(int[] nums) {
       int length = nums.length;
       int max =0,sum =0;

       for(int i=0;i<length;i++){
        if(nums[i] == 1){
            sum++;
            max = Math.max(sum,max);
        }
        else{
            sum =0;
        }
       }
       return max;
    }
}
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Consecitive con = new Consecitive();
        int[] nums = {1,1,0,1,1,1};
        int result = con.findMaxConsecutiveOnes(nums);  
        System.out.println("Max Consecutive Ones: " + result);


    }
}
