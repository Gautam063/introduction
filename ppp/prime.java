import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int f=1;
        int n= sc.nextInt();
        if(n==2){
            System.out.println(+n +" is prime");
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    f=0;

                }
                else {
                    f=1;
                }
            }
            if(f==1){
                System.out.println( +n+" is prime");
            }else{
                System.out.println(n+" is not prime");
            }
        }
        

    }
}
