package HashMaps;

import java.util.*;

class candies{
    public int distributeCandies(int[] candyType) {
        int length = candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int c : candyType){
            set.add(c);
        }
       int min = length/2;
       return Math.min(min,set.size());
    }
}
public class DistributedCandies {
    public static void main(String[] args) {
        candies obj = new candies();
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(obj.distributeCandies(candyType));
    }
}
