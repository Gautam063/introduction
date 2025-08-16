public class comparison {
    public static void main(String[] args) {
        String s1= "Gautam";
        String s2= "Gautam";
        String s3 = new String("Gautam");

        // if(s1==s2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("not equal");
        // }
    
        // if(s1==s3){
        //     System.out.println("Strings are equal");    s1 is not equal to s3
        // }else{
        //     System.out.println("not equal");
        // }
        if(s1.equals(s3)){                                  // equal funstion sirf value check kerta hai is liye s1=s3
            System.out.println("Strings are equal");   
        }else{
            System.out.println("not equal");
        }
    }
}
