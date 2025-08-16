public class sbuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch='A'; ch<='Z'; ch++){
            sb.append(ch);                                            // pichhe se character ko add kerta rhega
        }
       System.out.println(sb);

    //     String str= "Tony";
    //     for(char ch= 'a'; ch<='z'; ch++){
    //         str+= ch;
    //     }
    //   System.out.println(str);

    }
}