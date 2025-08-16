public class MethodOverloading {
    public static void main(String[] args) {
        // Calculator clac=  new Calculator();
        // System.out.println(clac.sum(2,3));
        // System.out.println(clac.sum((float)2.5, (float)3.5));
        // System.out.println(clac.sum(2,3,1));
        Deer d1= new Deer();
        d1.eats();         // Child class ka function run hoga
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;

    }
    int sum(int a, int b ,int c){
        return a+b+c;
    }
}
// Method overriding
class Animal{
    void eats(){
        System.out.println("eats any thing");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("only grass");
    }
}