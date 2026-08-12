package RecursionPractice;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
         String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        StringBuilder curr = new StringBuilder();
        helper(0,digits,mapping,res,curr);
        return res;
    }
    private void helper(int index,String digits,String[] mapping,
    List<String> result,StringBuilder curr)
    {
        //base case
        if(index == digits.length()){
            result.add(curr.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for(char ch : letters.toCharArray()){
            curr.append(ch);
            helper(index+1,digits,mapping,result,curr);
            curr.deleteCharAt(curr.length() -1);
        }

    }
}

public class Lettercombination {
    public static void main(String[] args) {
        Solution s = new Solution();
        String digits = "23";
        List<String> ans = s.letterCombinations(digits);
        System.out.println(ans);
        
    }
}
