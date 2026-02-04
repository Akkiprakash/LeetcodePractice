package HashMaps.Prime;

class Reverse{
    public void printing(String str){
        int length = str.length();
        int num =0;
        int power = 1;
        for(int i=length-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch == '1'){
                num += power;
            }
            power *=2; 
        }
        System.out.println(num);
    }
}
public class stringConversion {
    public static void main(String[] args) {
        
        String str = "1101";
        Reverse rev = new Reverse();
        rev.printing(str);


    }
}
