
public class Encapsulation {
   public static void main(String[] args) {
    
}
    
}
  

// Encapsulation is an oop concept where  
// Data and method are combined into one unit(class)
// Direct access to data is restricted  
// Access is given through controlled methods  
// Encapsulation = data hiding + controlled access 

// we use the access modifier  
// Access Modifier define who can access(use) a class , method , variable or constructor 
// type of access modifier 
// public  
// private  
// protected  
// default  

// Private  
// Accessible only inside the same class  
// not accessible outer side of class  
// used for data hiding  

// Default  --> we don't write anything  - it's default  
// Accessible only within the same package 

// Protected  
// Accessible in same class  
// same package  
// subclass (even in different package) 

// public  
// Accessible from anywhere  
// any class , any package  -> can access  

// private -> default -> protected  -> public  

// packages  

// A packages is a colection of related classes and inherfaces

// like the folder structure  
// Type of packages  
// 1 Built-in packages  -> provided by java  
// java.util , java.lang , java.io 
// 2 user-defined packages  and created packages

// package mypackage;
// class Test {
//     public void show() {
//         System.out.println("Hello");
//     }
// }    

// use the packages (import) 
// import mypackage.Test 
// import mypackages.*   

// root class we cannot use the private and protected acess modifier 

class student{
    private String name;
    private int age;
    private int rollno;
    private String college;

    public student(String name,int age,int rollno,String college){
        this.name = name; 
        this.age = age;
        this.rollno = rollno;
        this.college = college;
    }

    public void settername(String name){
    this.name = name;
    }
    public String getname(){
        return this.name;
    }
    public void seterage(int age){
        this.age = age;
    }
    public int getage(){
        return this.age;
    } 
     public void seterrollno(int rollno){
        this.rollno = rollno;
    }
    public int getrollno(){
        return this.rollno;
    }   
    public String getcollege(){
        return this.college;
    }
}

