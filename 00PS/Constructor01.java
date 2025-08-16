public class Constructor01 {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student("Gautam");
        Student s3 = new Student(63);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;
Student(){
    System.out.println("i am Gautam");    //Non- parameterized constructor
}
Student(String name){
       this.name= name;              // Parameterized
   }
Student(int roll){
       this.roll= roll;        //parameterized
   }

}
