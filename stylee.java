public class stylee {

    public static void printletters(String Str1){
        for(int i=0; i<Str1.length(); i++){
            System.out.print(Str1.charAt(i)+ "");
        }
    }
    public static void main(String[]args){
        String str1 = new String("Gautam");
        //printletters(str);
        String str2= "Gautam";
        // if(str1.equals(str2)){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
        str1.compareTo(str2);
    }
}