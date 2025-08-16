import java.util.*;
public class JavaBasic{
    
    public static int factoral(int n) {

        int f=1;
        for(int i=1; i<=n; i++){
            f= f*i;
        }
        return f;
    }
    public static int Binomial(int n, int r){
        int n_fact= factoral(n);
        int r_fact= factoral(r);
        int nr_fact= factoral(n-r);
        int bino= n_fact/(r_fact*nr_fact);
        System.out.println(bino);
        return bino;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }

     public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a ="+a);
        System.out.println(b);
     }
     public static void cal(int num1, int num2){
        int sum= num1+num2;
        System.out.println("sum = "+sum);
     }

    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
       int b= sc.nextInt();
       cal(a, b);

    
       
        //swap(10,5);
        //System.out.println(sum(4,6));
        //System.out.println(sum(3.2f,4.2f));
    }
}
   