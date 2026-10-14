class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum < 1 || sum >  num * 9l){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // caluclating the 9
        int remainder = sum % 9;
        int nines = sum / 9;
        for(int i=0;i<nines;i++){
            sb.append('9');
        }
        //adding the remainder
        if(remainder > 0){
            sb.append((char)('0'+ remainder));
        }
        // then adding the tailing zeros
        int zeros = num - sb.length();
        for(int i=0;i<zeros;i++){
            sb.append('0');
        }
        return sb.toString();
    }
}

public class Approach2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 3;
        int sum = 20;
        String ans = sol.maxSumOfSquares(num, sum);
        System.out.println(ans);
    }
}
