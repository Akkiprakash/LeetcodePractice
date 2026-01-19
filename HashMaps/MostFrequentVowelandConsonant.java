package HashMaps;

class solutuion{
     public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Counting the frequncy count
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int maxVowel = 0, maxConst = 0;

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (isvowel(ch)) {
                maxVowel = Math.max(maxVowel, freq);
            } else {
                maxConst = Math.max(maxConst, freq);
            }
        }
         return maxConst + maxVowel;
    }
    private Boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
public class MostFrequentVowelandConsonant {
public static void main(String[] args) {
    solutuion obj = new solutuion();
    String s = "leetcode";
    int result = obj.maxFreqSum(s); 
    System.out.println("Maximum Frequency Sum of Vowel and Consonant: " + result);
}
}
