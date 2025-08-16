public class sorting {
    public static void selectionSort(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int minpostion=i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[minpostion]> numbers[j]){
                    minpostion=j;
                }
            }
                int temp= numbers[minpostion];
                    numbers[minpostion]=numbers[i];
                    numbers[i]=temp;
            
        }
    }
    public static void bubbleShort(int numbers[]){
        int n= numbers.length;
        for(int turn=0; turn<n-1; turn++){
            int i=turn;
            for(int j=0; j<n-1-turn; j++){
               if(numbers[j]>numbers[j+1]){
                //swap
                   
                   int temp=numbers[j];
                  numbers[j]=numbers[j+1];
                  numbers[j+1]=temp;
                   
               }
               
            }
            
        }
    }
    public static void printarr(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={5,4,2,3,1};
      //bubbleShort(numbers);
      selectionSort(numbers);
      printarr(numbers);
       
    }
}
    