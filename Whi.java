public class Whi {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2; i<=Math.sqrt(n);i++ ){
            if(n%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void primeRange(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[]args){
       System.out.println(isprime(8));
       //primeRange(18);
        
    }
  
       
}


