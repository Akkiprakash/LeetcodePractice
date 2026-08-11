package RecursionPractice;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        genrate(list,n,0,0,"");
        return list;
    }
    private void genrate(List<String> list,int n,int open,int close,String ans){

        //base case
        if(ans.length() == 2*n){
            list.add(ans);
            return;
        }
        //proccesing
        if(open < n){
            genrate(list,n,open+1,close,ans+"(");
        }
        if(close < open){
            genrate(list,n,open,close+1,ans+")");
        }
    }
}
public class generateparentsis {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> ans = s.generateParenthesis(3);
        System.out.println(ans);
        
    }
}
