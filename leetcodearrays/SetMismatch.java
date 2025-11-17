
package leetcodearrays;

import java.util.*;

class mismatch{
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
       int dup = -1,sum =0,length = nums.length;
       for(int num : nums){
        if(!set.add(num)) dup = num;
        sum +=num;
       }
       int expected = length*(length+1)/2;
       int missing = expected -(sum-dup);
       return new int[]{dup,missing};
    }

}
public class SetMismatch {
    public static void main(String[] args) {
        mismatch mis = new mismatch();
        int[] nums = {1,2,2,4};
        int[] result = mis.findErrorNums(nums);
        for(int results : result){
            System.out.print(results + " ");
        }
    }
}
