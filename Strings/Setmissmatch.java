package Strings;

import java.util.HashSet;
import java.util.Set;

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
public class Setmissmatch {
    public static void main(String[] args) {
        mismatch obj = new mismatch();
        int[] nums = {1,2,2,4};
        int[] result = obj.findErrorNums(nums);
                System.out.println("Duplicate Number: " + result[0]);
                System.out.println("Missing Number: " + result[1]);
    }
}
