package MathsProblems;

class add {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
public class plus_one {
    public static void main(String[] args) {
        add obj = new add();
        int[] digits = {9,9,9}; 
        int[] result = obj.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }   
    }
}
