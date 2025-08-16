package Practice;
import java.util.*;
public class P2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        float a= sc.nextInt();
        float b= sc.nextInt();
        float c= sc.nextInt();
        float avg= (a+b+c)/3;

        System.out.println("average = "+avg);


    }
}