import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome you can start calculation");
        Scanner sc= new Scanner(System.in);
        // For addition
        int a= sc.nextInt();
        int b= sc.nextInt();
        int Sum=a+b;
        System.out.println("Ans =" + Sum);
        System.out.println("Congratulation your work is complete go ahead");
        // For Substraction
        int c=sc.nextInt();
        int d= sc.nextInt();
        int Substraction= c-d;
        System.out.println("Ans = "+Substraction);
        System.out.println("Congratulaton your work is complete go ahead");
         // For division
        int e=sc.nextInt();
        int f=sc.nextInt();
        int division = e/f;
        System.out.println("Ans =" + division);
        System.out.println("Congratulation your work is complete go ahead");
        // For Substraction
        int g = sc.nextInt();
        int h = sc.nextInt();
        int multi=g*h;
        System.out.println("Ans =" + multi);
        System.out.println("Congratulation you are completed your work");
        


    }
}
