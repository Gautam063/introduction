public class Subssyting {
    public static String substring(String str , int si, int ei){      // si= starting index, ei = ending index
        String substr = "";
        for(int i=si; i<ei ; i++){
            substr+= str.charAt(i);        // substr= substr + str.charAt(i)
        }
        return substr;
    }
    public static void main(String[] args) {
        String str= "HelloWorld";
        //System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0,5));  // already existing function in java

        // we have to find largest string
        // String fruits[]= {"apple", "mango", "banana"};

        // String largest =fruits[0];
        

        // for(int i=1; i< fruits.length; i++){
        //     if(largest.compareToIgnoreCase(fruits[i]) < 0){
        //         largest= fruits[i];

        //     }
        // }
        // System.out.println(largest);      // output = mango

    }
}
