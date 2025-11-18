package MathsProblems;

class Checkingpalidrome {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalidromeNumber {
    public static void main(String[] args) {
        Checkingpalidrome ch = new Checkingpalidrome();
        int x = 121;
        Boolean result = ch.isPalindrome(x);
        System.out.println(result);
    }
}
