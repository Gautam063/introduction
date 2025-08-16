import java.util.Scanner;
public class Array02 {
    public static void main(String[] args) {
        int marks[]= new int[100];
        Scanner sc= new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy =" + marks[0]);
        System.out.println("Chemistry =" + marks[1]);
        System.out.println("Math =" + marks[2]);

    }
}
