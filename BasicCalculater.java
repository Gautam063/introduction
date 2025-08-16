import java.util.*;
public class BasicCalculater {
    public static void main(String[] args) {
        int a= 30;
        int b= 40;
        int sum= a+b;
        System.out.println("Add ="+ sum);
        System.out.println("Now division process will start");
        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
        int s= sc.nextInt();
        int division= d/s;
        System.out.println("Division =" + division);

        System.out.println("Now The Multiplication will start");
        int x= sc.nextInt();
        int z= sc.nextInt();
        int Multiplication = x*z;
        System.out.println(Multiplication);

        System.out.println("Now the substraction will start");
        int m= sc.nextInt();
        int n= sc.nextInt();
        int o= m-n;
        System.out.println("Substraction ="+ o);

        System.out.println("Calculate Simple intrest");
        int p= sc.nextInt();
        int r= sc.nextInt();
        int t= sc.nextInt();
        int SI= (p*r*t)/100;
        System.out.println("S.I ="+ SI );

        System.out.println("process complete");


    }
}
