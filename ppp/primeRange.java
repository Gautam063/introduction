import java.util.Scanner;

public class primeRange {
    // public static void isprime(int n){
    //     Scanner sc= new Scanner(System.in);
    //     int f=1;
    //     int m= sc.nextInt();
    //     if(m==2){
    //         System.out.println(+m +" is prime");
    //     }else{
    //         for(int i=2; i<=Math.sqrt(m); i++){
    //             if(m%i==0){
    //                 f=0;

    //             }
    //             else {
    //                 f=1;
    //             }
    //         }
    //         if(f==1){
    //             System.out.println( +m+" is prime");
    //         }else{
    //             System.out.println(m+" is not prime");
    //         }
    //     }
        
    // }
    public static void main(String[] args) {
        int n,f=1;
        Scanner sc= new Scanner(System.in);
         n= sc.nextInt();
         for(int i=2; i<n; i++){
            if(n%i !=0){
                f=1;
            }else{
                f=0;
            }
         }
         if(f==1){
            System.out.println("prime");
         }else{
            System.out.println("not prime");
         }
        
    }
}