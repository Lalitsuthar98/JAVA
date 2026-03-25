public class polymorphism {
       public static void main(String[] args) {
        //    mathoperation m1 = new mathoperation();
        //    System.out.println(m1.add(10.2, 20));
        //    System.out.println(m1.add(10, 20));    
        //    Animal a1 = new Animal();
        //    a1.sound();
        //    a1 = new Dog();
        //    a1.sound();
           
       }
    
}  
// --------------notes------------------

// Polymorphism in java is one of the core concept of object oriented programming The word polymorphism means "many form"  
// In java , polymorphism allows a single entity(method,object or interface) to behave  differently depending on the context 

// type of polymorphism    2 type  
 
// compile time polymorphism (method overloading) 
// This happen at compile time  
// same method name ,but different parameters(type,number,or order) 
class mathoperation{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}   
// method is decided during compilation 

// 2. Runtime polymorphism 
// This happens at runtime using inheritance 
// A subclass provides a specific implementation of a method that is already defined in parent  class  

class Animal{
    void sound(){
        System.out.println("Animal makes the sound");
    }
}  
class  Dog extends Animal{
    void sound(){
        System.out.println("dogs barks");
    }
}  

// static method cannot we overwrite because of they belonging to the class not the object specific 

// private method cannot we overwrite because of we cannot access the private outside they class 

// final method cannot be override because it is constant  

// variable also not include in polymorhism we check the refernce variable 

