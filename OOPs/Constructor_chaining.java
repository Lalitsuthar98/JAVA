// public class Constructor_chaining {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student("Lalit");
//         Student s3 = new Student("Lalit", 21);
//         Student s4 = new Student("Lalit", 22, 101);
//         Student s5 = new Student("Lalit",22,101,"Techno");
//     }
// }

// Constructor chaining 
 // -->Calling one constructor from another constructor in a same class or from the parent class  
 // It allows constructor to reuse intializations code instead of writing the same code multiple times  
  
 // chaing is done by the this keyword  

//  class Student{
//     String name;
//     int Age;
//     int Rollno;
//     String college;

//     Student(){
//         this(null); 
//         System.out.println("default first constructor");
//     }
//     Student(String name){
//         this(name,0); 
//         System.out.println("second constructor");
//     }
//     Student(String name,int Age){
//        this(name,Age,0); 
//        System.out.println("Third constructor");
//     }
//     Student(String name,int Age,int Rollno){
//         this(name, Age,Rollno,null); 
//         System.out.println("Fourth constructor");
//     }
//     Student(String name,int Age,int Rollno,String college){
//         this.name = name;
//         this.Age = Age;
//         this.Rollno = Rollno;
//         this.college = college; 
//         System.out.println("Last constructor ");
//     }
//  }