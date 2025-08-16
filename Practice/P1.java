package Practice;


import java.util.Scanner;

public class P1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1){
            System.out.println("Not Prime");
        }else if(n==2){
            System.out.println("Prime");
        }else{
            boolean isprime= true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                   isprime= false;
                }
            }
            if(isprime == true){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }

        }
        
        
}
}
