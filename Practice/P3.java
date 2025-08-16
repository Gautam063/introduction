package Practice;
import java.util.*;

public class P3 {
    public static void main(String [] args){
        // System.out.println("enter the side of square");
        // Scanner sc= new Scanner(System.in);
        // int side= sc.nextInt();
        // int area= side*side;
        // System.out.println("Area of square is " +area);

        System.out.println("Enter the costs");
        Scanner sc= new Scanner(System.in);
        System.out.println("Cost of pencil");
        float pencil= sc.nextFloat();
        
        System.out.println("Cost of pen");
        float pen = sc.nextFloat();

        System.out.println("Cost of eraser");
        float eraser= sc.nextFloat();
         
        System.out.println("your total bill = ");
        float bill= pencil+pen+eraser;
        System.out.println(bill);
        System.out.println("total bill with 18% GST =");
        float GSTbill= bill + 0.18f*bill;
        System.out.println(GSTbill);

        // no error
        int $= 24;
        System.out.println($);

    }
}
