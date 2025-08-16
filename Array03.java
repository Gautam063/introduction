// Linear Search
// Find the index of element in a given array {2,4,6,8,10,12,14,16}  where key = 10
public interface Array03 {

    public static void linearSearch(int data[], int key){
        for(int i=0; i< data.length; i++){
            if(data[i]== key){
                System.out.println("This is your key =" + data[i]);
            }
           
        }
        System.out.println(+ key +" is not hare");
        
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};
        int key=15;
        linearSearch(array, key);
    }
}
