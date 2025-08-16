public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.Setcolor("Red");
        System.out.println(p1.color);
    }
    }  
    
    
    class Pen{
        String color;
        int tip;
    
        void Setcolor(String newcolor){
           color= newcolor;
        }
        void Settip(int newtip){
            tip = newtip;
        }
    
    }
    