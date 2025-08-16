public class sbuilder1 {

    public static String toupperCase(String str){
      StringBuilder sb = new StringBuilder("");
        char ch = java.lang.Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i< str.length(); i++){
            if(str.charAt(i)== ' ' && i< str.length()-1){
                sb.append(str.charAt(i));                      // yaha pe space character me add hoga
                i++;                                                      
                sb.append(java.lang.Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am gautam";
        System.out.print(toupperCase(str));
    }
}
