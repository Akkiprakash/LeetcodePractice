package MathsProblems;

class Arrange{
    public int arrangeCoins(int n) {
         int i = 1; 
        int count = 0;

        while (n >= i) {
            n -= i;
            i++;
            count++;
        }

        return count;
    }
}
public class Arrangecoins {
    public static void main(String[] args) {
        Arrange obj = new Arrange();
        int n = 5;
        System.out.println(obj.arrangeCoins(n));
    }
}
