
import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        //finding the two min and subtract from the money and return the remaining money
        /*  brute force
        sort the array and sum of the first two prices and next subtract from the money
        */
        Arrays.sort(prices);
        return money - (prices[0] + prices[1]) < 0 ? money : money - (prices[0] + prices[1]) ;
    }
}
public class BruteForce {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {1, 2, 2};
        int money = 3;
        int ans = sol.buyChoco(prices, money);
        System.out.println(ans);
    }
}
