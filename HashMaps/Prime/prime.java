package HashMaps.Prime;

public class prime {
    public static void main(String[] args) {
        int num = 4;
        
        for(int i=2;i<=num;i++){
            System.out.println("i "+i );
           boolean isprime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i + " is prime");
            }else{
                System.out.println(i + " is not prime");
            }
        }
       
    }
}
