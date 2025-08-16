import java.util.Scanner;

public class CheckVoterID {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("if you do not have Voter Id card then type nmber between 5 to 10");
            System.out.println("if you have voter id card then type number between 1 to 4");
        } else{
            System.out.println(" you are not eligible for voter id card");
        }
        int a= sc.nextInt();
         if(a>=5 && a<=10){
            System.out.println(" This is the full process for making Voter Id card");
            System.out.println("(1) First you have Adhar card");
            System.out.println("(2) Second you must have pan card ");
         }if(a>=1 && a<=4){
            System.out.println("Congratulation! You are eligible for voting in india");
         }
      
        
 }
}
