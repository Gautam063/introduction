public class Practice{
   public static void Bintodec(int binnum){
      int mynum= binnum;
      int pow=0;

      int decnum=0;
      while(binnum>0){
         int lastd= binnum%10;
         decnum= decnum +(lastd * (int)Math.pow(2,pow));
         pow++;
         binnum=binnum/10;
      }
      System.out.println("decimal of " +mynum+" =" +decnum);
   }
   public static void dectobin(int n){
      int pow= 0;
      int binnum=0;
      while(n>0){
         int rem= n%2;
         binnum= binnum + (rem*(int)Math.pow(10, pow));
         pow++;
         n=n/2;
      }
      System.out.println(binnum);
   }
   public static void main(String[] args) {
      int i=1;
      int z= i/2;
      System.out.println(z);
      
      dectobin(5);
      
   }
}