public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Lalit Suthar");
        Student s3 = new Student("Lalit suthar", 22);
        Student s4 = new Student("lalit", 22, 101);
        Student s5 = new Student("Lalit", 22, 101, "Techno"); 
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
class Student{
    String name;
    int Age;
    int rollNo;
    String college;
    // constructor using the this keyword and overloading 
    Student(){
        System.out.println("default constructor was called");
    }
    Student(String name){
        this.name = name;
    }
    Student(String name,int Age ){
        this.name = name;
        this.Age = Age;
    }
    Student(String name,int Age,int rollno){
        this.name = name;
        this.Age = Age;
        this.rollNo = rollno;
    }
    Student(String name,int Age,int rollNo,String college){
        this.name = name;
        this.Age = Age;
        this.rollNo = rollNo;
        this.college = college;
    }
    void display(){
        System.out.println(name);
        System.out.println(Age);
        System.out.println(rollNo);
        System.out.println(college);
    }
}

// Object is an instance of a class  
// object represents a real entity and uses the class property 

// Aconstructor is a special method used to initialize objects 
// property 
// same name a class  
// no return type 
// Automatically called when object is created  
// two type of constructor 
// 1. Default constructor 
// 2. parameterized constructor  
// Note we created the prameterized constructor then default construcotr was not called automatically 
// this keyword refer to the current onject 


