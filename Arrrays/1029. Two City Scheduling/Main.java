class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int length = costs.length; 
        int mid = length/2;
        Arrays.sort(costs,(a,b)->{
           return (a[0] - a[1]) - (b[0] - b[1]);
        });
        int total =0;
        for(int i=0;i<length;i++){
            if(i < mid){
                total += costs[i][0];
            }else{
                total += costs[i][1];
            }
        }
        return total;
    }
    //tc -> for sorting it takes nlogn + o(n)
    // sc -> may the sorting takes the space 0(n)
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        int ans = sol.twoCitySchedCost(costs);  
        System.out.println(ans);
    }
}
