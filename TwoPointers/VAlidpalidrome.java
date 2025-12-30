package TwoPointers;

class validcheck{
    public boolean isPalindrome(String s) {
       int left =0; int right =s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
return true;
    }
}
public class VAlidpalidrome {
    public static void main(String[] args) {
        validcheck obj = new validcheck();
        String s = "A man, a plan, a canal: Panama";
        boolean result = obj.isPalindrome(s);   
        System.out.println("Is the string a valid palindrome? " + result);
    }

}
