public class pass {
    public static void main(String[] args) {
        Passs p1= new Passs();
        //p1.password="gdhj";                        // this will execute when password is public
        //System.out.println(p1.password);
        p1.changepwd("abchd");              // this will execute when password is private
        System.out.println(p1.getpwd());
    }
}
 class Passs{
    private String password;

    public String getpwd(){
      return this.password;
    } 

      void changepwd(String password){
       this.password= password;
    }
 }