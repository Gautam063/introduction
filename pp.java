public class pp {
    public static void pattern(int n){
        
        for(int i=1; i<=n; i++){
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(+j);
            }
            System.out.println();
        }
    }
    public static void reverse(int numbers[]){
        int first=0,  last= numbers.length-1;
        while(first<last){
            int temp=last;
            last=first;
            first=temp;
            first++;
            last--;
        }

    }
    public static void main(String[]args){
      //pattern(5);
      int number[]={2,4,6,8,9};
      reverse(number);
      for(int i=0; i<number.length; i++){
        System.out.print(number[i]+ " ");
      }
        

    }
}
