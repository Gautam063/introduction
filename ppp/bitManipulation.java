package ppp;

public class bitManipulation {
    public static void evenodd(int n){                // if LSB is 0 than it will even otherwise it will odd ,  4=100=even and 101(5) is odd
        if((n & 1)==0){
            System.out.println("your typed number is even");
        }else{
            System.out.println("your typed number is odd");
        }
    }
    public static int getithBit(int n, int i){
        int bitmask=1<<i;
        if ((n& bitmask) ==0) {
            return 0; 
        } else{
            return 1;
        }
    }
    public static int setithBit(int n, int i){
        int bitmask= 1<<i;
        return n | bitmask;
    }
    public static int clearithBit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static int countsetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!= 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int update(int n, int i, int newbit){
        
        // n= clearithBit(n, i);
        // int bitmask= newbit<<i;
        //  return n | bitmask;
        if(newbit==0){
            return clearithBit(n, i);
        }else{
            return setithBit(n, i);
        }
         
    }
    public static int clearlastiBits(int n, int i){
        int bitmask= (~0)<<i;
        return n&bitmask;
    }
    public static int clearRangeOfiBits(int n, int i, int j){
          int a=(~0)<<j+1;
          int b= 1<<i -1;
          return n &(a|b);
    }
    public static void main(String[] args) {
        //System.out.println(getithBit(4, 2));
      // System.out.println(setithBit(10, 2));
      // System.out.println(clearithBit(10, 2));
       //evenodd(4);
     // System.out.println(update(10, 2, 1));
      //System.out.println(countsetBits(10));
      //System.out.println(clearlastiBits(15,2));
      System.out.println(clearRangeOfiBits(10, 02, 04));
    }
}
