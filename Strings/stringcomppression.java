package Strings;

public class Innerstringcomppression {
public int compress(char[] chars) {
        //using the two pointers approach
        if(chars.length == 1) return 1;
        int n = chars.length;
        int idx = 0;
        int i=0;
        while (i < n) {
            char ch = chars[i];
            int count = 0;
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
            if (count == 1)
                chars[idx++] = ch;
            else {
                chars[idx++] = ch;
                for(var c : Integer.toString(count).toCharArray()){
                    chars[idx++] = c;
                }
                
            }
        }
        return idx;
    }
    
}
public class stringcomppression {
public static void main(String[] args) {
    Innerstringcomppression obj = new Innerstringcomppression();
    char[] chars = {'a','a','b','b','c','c','c'};;
    int newLength = obj.compress(chars);    
    System.out.println("Compressed Length: " + newLength);
    System.out.print("Compressed Array: ");
    for (int i = 0; i < newLength; i++) {
        System.out.print(chars[i] + " ");
    }
}
}
