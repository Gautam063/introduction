public class OOPS {
    public static void main(String[]args) {
        Pen p1= new Pen();                     // pen() it creates constructor
        p1.Setcolor("yellow");
       // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.Settip(5);
       // System.out.println(p1.tip);
       System.out.println(p1.gettip());
    }
    }  
    
    
    class Pen{
        String color;
        private int tip;
          public String getColor() {
              return this.color;
          }
          public int gettip(){
            return this.tip;
          }
        void Setcolor(String newcolor){
           color= newcolor;
        }
        void Settip(int tip){
           this.tip = tip;
        }
    
    }
    