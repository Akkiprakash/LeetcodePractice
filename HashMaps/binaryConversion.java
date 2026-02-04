package HashMaps;

class binaryReverse{
   public String binary(int n){

    String reverse = "";
    while(n !=1){
        if(n % 2 == 1){
            reverse += '1';
        }else{
            reverse +='0';
        }
        n = n/2;
    }
    return reverse;
   }
   public String printing(String s){
    StringBuilder  str = new StringBuilder(s);
    return  str.reverse().toString();

   }
}
public class binaryConversion {

    public static void main(String[] args) {
        int a = 10;
        binaryReverse br = new binaryReverse();
        String result = br.binary(a);
        String print = br.printing(result);
        System.out.println(print);
       
    }

   
}