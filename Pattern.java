public class Pattern {

    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=n; i>=1; i--){
             //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            for(int j=1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void zero1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void Floyedstriangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
            System.out.print(counter + " ");
            counter++;
            }
            System.out.println();
        }
    }
    public static void pyramid1(int n){
        for(int i= 1; i<=n; i++ ){
            // spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void gg(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i;j++){

                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
            counter--;
        }
    }

    public static void Hollowrec(int trows, int tcolum ) {
        for(int i=1; i<=trows; i++){
            for(int j=1; j<=tcolum; j++){
                if(i==1 || i==trows || j==tcolum || j== 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
       // zero1(5);
        //Hollowrec(5, 5);
         butterfly(5);
         pyramid1(6);
    }
}
