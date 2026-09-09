

class Solution {
    public int maximumSwap(int num) {
        //building the char Array
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[minIndex] <= ch[j]) {
                    minIndex = j;
                }
            }
            //swapping
            if (ch[i] < ch[minIndex]) {
                char temp = ch[i];
                ch[i] = ch[minIndex];
                ch[minIndex] = temp;
                break;
            }
        }
        return Integer.parseInt(new String(ch));
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 2736;
        int ans = sol.maximumSwap(num);
        System.out.println(ans);
        
    }
}
