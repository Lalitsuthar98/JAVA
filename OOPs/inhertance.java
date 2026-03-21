public class inhertance {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.bark();
        // C c1 = new C();
        // c1.printA();
        // c1.printB();
        // c1.printC();
        // child c1 = new child();

    }
}
  
// inheritance is a core object Oriented programming (oop) mechanism where a new class (subclass/child) acquires the properties (field) and behaviors(method) of an existing class (superclass/parent) It facilities code reusability ,esablishes, a hierarchical "IS-A" relationship and implemented using the extends keywords 

// type of inheritance  
// single inheritance
// multilevel inheritance  
// Hierarchical inhertaince  
// multiple inheritance(via inhertances only)

// single inheritance  hav only parent class and one child class  

// class Animal{
//     void eat(){
//         System.out.println("Animal eat food ");
//     }
// }
// class Dog extends Animal{
//      void bark(){
//         System.out.println("Dog barks");
//      }
// }

// Multilevel inheritance  
// chain of inheritance  
// A-> B -> c 

// class A{
//     void printA(){
//         System.out.println("class A function is called");
//     }
// }
// class B extends A {
//    void printB(){
//     System.out.println("class B function is called");
//    }
// }

// class C extends B{
//     void printC(){
//         System.out.println("class C function is called");
//     }
// }

// Hierarchical inheritance 
// one parent --> multiple child classes  

// class Animal{
//     void eat(){
//         System.out.println("Animal eat food");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog do bark");
//     }
// }
// class Cat extends Animal{
//     void mown(){
//         System.out.println("cat do mown");
//     }
// }

// mutliple inheritance  in java achieve by the interface and inplement 


// Super keyword 

// Super is a rfernence  variable used to refer to the immediate parent class object 
// super = acess parent class thing from child class  

// Need super in class  
// when child class:
// has same variable name  
// overrides method 
// need to class parent constructor  

// mainly super used 3 purposes  
// 1. Access parent class variable 
//
// when parent class & child have same variable name  
// class Parent{
//     int X = 10;
// }

// class child extends Parent{
//     int X = 20;
//     void print(){
//         System.out.println("the child class X value :" + X);
//         System.out.println("the parent class X value :" + super.X);
//     }
// }

// 2. Call parent class method  
// when method are overridden 

// class parent {
//     void display(){
//         System.out.println("parent function called");
//     }
// }
// class child extends parent{
//     void display(){
//         System.out.println("child function called");
//         super.display();
//     } 
// }

// 3 call parent class constructor  
 class parent{
     parent(){
        System.out.println("parent class constructor called");
     }
 }
 class child extends parent{
    child(){
        System.out.println("child class construcot called"); 
        super();
    }
 }



