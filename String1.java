public class String1 {

    public static void printss(String str){
     
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String fName = "Gautam";
        String lName = "Gambhir";
        String fullName = fName +" " +lName;
        printss(fullName);
    }
}
