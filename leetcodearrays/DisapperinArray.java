package leetcodearrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Disaapear{
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> set = new HashSet<>();
       List<Integer> list = new ArrayList<>();

       for(int num : nums){
        set.add(num);
       }
       for(int i=1;i<=nums.length;i++){
        if(!set.contains(i)) list.add(i);
       }
       return list;
    }
}
public class DisapperinArray {
    public static void main(String[] args) {
        Disaapear sol = new Disaapear();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = sol.findDisappearedNumbers(nums);
        System.out.println("Disappeared Numbers: " + result);
        
    }

}
