package SlidingWindows;
import java.util.HashSet;
import java.util.Set;

class Charc{
     public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();
        int max= 0, left =0,length = s.length();

        for(int i=0;i<length;i++){
            while(map.contains(s.charAt(i))){ // while is used if the character is still present in
            // the set after the removing of the left elemnt 
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(i));
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
public class LongestSubstring {
    public static void main(String[] args) {
        Charc obj = new Charc();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
