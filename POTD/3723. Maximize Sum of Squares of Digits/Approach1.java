class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum < 1 || sum >  num * 9l){
            return "";
        }
        StringBuilder str = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<num;i++){
            min = Math.min(9,sum);
            str.append(min);
            sum -= min;
        }
        return str.toString();
    }
}

public class Approach1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 3;
        int sum = 20;
        String ans = sol.maxSumOfSquares(num, sum);
        System.out.println(ans);
    }
}
