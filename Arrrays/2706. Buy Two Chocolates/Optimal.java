

class Solution {
    public int buyChoco(int[] prices, int money) {
        //finding the two min and subtract from the money and return the remaining money
        /*  brute force
        sort the array and sum of the first two prices and next subtract from the money
        */
        // Arrays.sort(prices);
        // return money - (prices[0] + prices[1]) < 0 ? money : money - (prices[0] + prices[1]) ;

        /*
        simple from the problem just the only two we want to takes the precies to buy the choco 
        then tracking the two minimum which gives the less possiblites of the buying
        */
        int min1,min2;
        min1 = min2 = Integer.MAX_VALUE;
        for(int i =0; i<prices.length;i++){
            if(prices[i] < min1){
                min2 = min1;
                min1 = prices[i];
            }else if (prices[i] < min2){
                min2 = prices[i];
            }
        }
        //at the end we get the min1 and min2 just returning with the checking the base cases
        return money - (min1 + min2) < 0 ? money : money - (min1 + min2) ; 
    }
}
public class Optimal {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {1,2,3};
        int money = 3;
        int ans = sol.buyChoco(prices, money);
        System.out.println(ans);
    }
}
