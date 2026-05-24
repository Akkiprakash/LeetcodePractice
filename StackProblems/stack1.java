package StackProblems;


import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> count_stack = new Stack<>();
        Stack<StringBuilder> str_stack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num =0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch-'0');
            }
            else if (ch == '['){
                // pushing the count stack 
                // pushing the strstack and cur to new string
                count_stack.push(num);
                str_stack.push(curr);
                num =0;
                curr = new StringBuilder();
            }else if( ch == ']'){
                // poping
                int repeated = count_stack.pop();
                StringBuilder prev=str_stack.pop();

                for(int i=0;i<repeated;i++){
                    prev.append(curr);
                }
                curr = prev;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
public class stack1 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "3[a]2[bc]";
        String result = obj.decodeString(s);
        System.out.println(result); // Output: "aaabcbc"
    }

}
