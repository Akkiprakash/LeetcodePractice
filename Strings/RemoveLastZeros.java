package Strings;

import java.util.Scanner;

public class RemoveLastZeros {

    public static String regeString(String str){

        int length = str.length();
        int i = length -1;
        while(i>=0 && str.charAt(i) == '0'){
            i--;
        }
        return str.substring(0,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(regeString(input));
    }

}
