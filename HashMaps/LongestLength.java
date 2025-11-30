package HashMaps;

import java.util.HashSet;
import java.util.Set;

class Longest{
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
public class LongestLength {

    public static void main(String[] args) {
        Longest obj = new Longest();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s));    
        
    }
}
