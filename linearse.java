import java.util.Scanner;

//import.java.util.*;
public class linearse {
    public static int linearserch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();

        int numbers[]={2,3,4,6,8,10};
       // int key=8;
        int index=linearserch(numbers, key);
        if(index==-1){
            System.out.println("your number is not found");
        }else{
            System.out.println("yes! Founded");
        }

    }
    
}
