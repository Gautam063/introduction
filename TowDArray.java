import java.util.*;
public class TowDArray {
    public static boolean searach(int numbers[][], int key){
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[0].length; j++){
                if(numbers[i][j]== key){
                    System.out.println("key found at ("+i+ ", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n= matrix.length;
        int m= matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        searach(matrix, 5);
        
    }
    
}
