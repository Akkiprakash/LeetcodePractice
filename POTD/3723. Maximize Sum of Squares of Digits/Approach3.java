
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum < 1 || sum >  num * 9l){
            return "";
        }
        int remainder = sum % 9;
        int digits = sum / 9;
       StringBuilder str = new StringBuilder().repeat('9',digits);
       if(remainder > 0){
        str.append(remainder);
       }
       str.repeat('0', num - str.length());
       return str.toString();
    }
}

public class Approach3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 3;
        int sum = 20;
        String ans = sol.maxSumOfSquares(num, sum);
        System.out.println(ans);
    }
}
