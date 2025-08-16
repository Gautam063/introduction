public class Inheritance {
    public static void main(String[] args) {
       shark s1= new shark();
       s1.eat();
       s1.swim();
       s1.breathe();
       s1.weight="100kg";
       System.out.println(s1.weight); 
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats...");
    }

    void breathe(){
        System.out.println("breathe...");
    }
}

class Fish extends Animal {
    void swim(){                                                // single level inheritance
             System.out.println(" swims in water");
    }
}
class shark extends Fish {
      String weight;             // this example of multi level inheritance

}
class Dog extends Animal{
    void bark(){
        System.out.println("bark..");         // hierarchial inheritance
    }
}
class cat extends Animal{
    void meuw(){
        System.out.println("meuw");
    }
}