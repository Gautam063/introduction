public class Arraypr{
  // public static void update(int n[]){
    //   for(int i=0; i< n.length; i++){
      //  n[i]=n[i]+1;
        //}
     public static int linearserch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
     }
     public static int greatestvalue(int numbers[]){
        int largest=Integer.MIN_VALUE;//minus infinity
        int smallest= Integer.MAX_VALUE;//plus infinity
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
               
            }
        }
       System.out.println("smallest ="+smallest);
   return largest;
     }
    
    public static void main(String[] args) {
        //marks update
      /*   marks[]={95,96,97};
        update(marks);
        // ootput print
        for(int i=0; i< marks.length; i++){
        System.out.println(marks[i]+ " ");
        }*/

        //linearserch
       /*  int numbers[]= {2,4,6,8,10,12,14};
        int key=14;
        int index= linearserch(numbers, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index " +index);
        }*/
        int numbers[]={1,2,3,4,5,6,7};
       System.out.println("largest ="+greatestvalue(numbers));
        System.out.println();
    }
}