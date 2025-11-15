package leetcodearrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
     public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        // finding the unique elemnets in both the arrays
        for(int s : nums2){
           set.add(s);
        }
        for(int num : nums1){
            if(set.contains(num)){
                set1.add(num);
            }
        }

        int[] result = new int[set1.size()];
        int i =0;
        for(int nu : set1){
            result[i++] = nu;
        }
        return result;

     /*
      * we Can also do using this both are the simple approach only
      */
        //  for(int s1 : nums1){
        //     set1.add(s1);
        // }
        // List<Integer> list = new ArrayList<>();
        // for(var nums : set1){
        //     if(set.contains(nums)){
        //         list.add(nums);
        //     }
        // }
        // //convert the arrayList to the int[]
        // int[] result = new int[list.size()];
        // for(int i=0;i<list.size();i++){
        //     result[i] = list.get(i);
        // }
        // return result;
    }
}
