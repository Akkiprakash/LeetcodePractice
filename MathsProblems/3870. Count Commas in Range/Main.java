

class Solution {
    public int countCommas(int n) {
        int count = 0;
        if (n >= 1000) {
            count += n - 999;
        }
        if (n > 100000) {
            count += n - 99999;
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 1000000;
        int ans = sol.countCommas(n);
        System.out.println(ans);
    }
    
}
