public class Oops1{
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.Setcolor("blue");
        System.out.println(p1.getColor());
    }
}

class Pem{
   public String color;
    int tip;

      public String getColor(){
        return this.color;
      }
    void Setcolor(String newcolor){
        color=newcolor;
    }
}