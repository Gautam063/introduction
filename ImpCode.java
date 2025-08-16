public class ImpCode {
  public static boolean isprime(int n){
    boolean isprime=true;
   for(int i=2; i<=Math.sqrt(n); i++){
       if(n%i==0){
        isprime = false;
       }
   }
   return isprime;
  }
  public static void primerange(int n){
    for(int i=2; i<=n; i++){
      if(isprime(i)){   //true
         System.out.print(i+ " ");
      }
      
    }
    System.out.println();
  }
    public static void main(String args[]){
    //System.out.println(isprime(8));
    primerange(18);
    }
}
