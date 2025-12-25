package MathsProblems;

class single{
     public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
}
}
public class singleNumber {
   public static void main(String[] args) {
    single obj = new single();  
    int[] nums = {4,1,2,1,2};
    System.out.println(obj.singleNumber(nums));
   }
    
}
