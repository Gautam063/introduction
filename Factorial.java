public class Factorial {

    public static int Factorials(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
         return f;
    }
    public static int bincoeff(int n, int r){
        int fact_n= Factorials(n);
        int fact_r= Factorials(r);
        int fact_nr= Factorials(n-r);
        int bincoeff= fact_n/(fact_r*fact_nr);
        return bincoeff;

    }
    public static void main(String[] args) {

       
       System.out.println(bincoeff(6, 2));
    
        
    }
    
}
