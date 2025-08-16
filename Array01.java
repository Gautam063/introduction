public class Array01{

    public static void printNumbers(int num1[]){
        for(int i=0; i<num1.length; i++){
          
            if(num1[i]== 30){
                //System.out.println(num1[i]);
               // continue;
               break;
            }
            System.out.println(num1[i]);

            
        }
    }

    public static void update(int marks[]){
        
        for(int i=0; i< marks.length; i++){
              marks[i]= marks[i] +1;
        }
    }
    public static void main(String[]args){
        int data[]= {10,20,30,40};
       // printNumbers(data);
       update(data);

       //output

       for(int i=0; i< data.length; i++){
        System.out.println(data[i]);
    }

    }    
}