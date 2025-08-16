// Find the largest number in a given array among these data [1,2,3,6,5,4]
// Integer.Min_VALUE = - INFINITY
// Integer.MiX-VALUE = + INFINITY

public class Array04 {

    public static int largestNumber(int numbers[]){
        int largest= Integer.MIN_VALUE;  // -infinty
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > largest){
                largest= numbers[i];
            }
            if(numbers[i]< smallest){
                smallest= numbers[i];
            }
        }
          System.out.println("Smallest= " +smallest);
          return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,6,5,4};
        System.out.println("largest =" + largestNumber(numbers));

    }
}
