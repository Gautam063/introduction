public class CopyConstructor {
    public static void main(String[] args) {
       Student s1= new Student();
       s1.name="Gautam";
       s1.age= 20;
      // s1.password="gghaf";
      s1.password="dgdh";
      System.out.println(s1.password);
    

       System.out.println(s1.name);
       s1.marks[0]=100;
       s1.marks[1]=90;
       s1.marks[2]=80;

       Student s2= new Student(s1);
       s2.password="xys";
       s1.marks[2]=95;

       for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
       }
    }
}

class Student{
    String name;
    int age;
    String password;
    int marks[]= new int[3];


    // Shallow copy constructor
    // Student(Student s1){
    //   marks = new int[3];
    //   this.name= s1.name;
    //   this.age= s1.age;
    //   this.marks=s1.marks;

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name= s1.name;
        this.age= s1.age;
    
        for(int i=0; i<3; i++){
            this.marks[i]=s1.marks[i];
           }
    
    }
    Student(){
        System.out.println("ji");
    }

}