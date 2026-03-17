public class static_final {   
//     static{
//         System.out.println("static block executed");
//     }
// static void fun(){
//     System.out.println("This is the static method and call by the static function");
// }
   public static void main(String[] args) {
        // student s1 = new student();
        // student s2 = new student();
        // System.out.println(s1.college);
        // System.out.println(s2.college); 
        // System.out.println(student.college);   
        // fun();  
        // final keyword variable   
        // final double PI = 3.14;
        // System.out.println("PI value :" + PI); 

    }
} 

// Notes of static and final keyword  
// IN java static means belongs to the class , not to object 
// static belongs to class memory area  
// static variable create in static memory 
 
// class student{
//     static String college = "Techno";

//     // static{     // this static block use to intialize the value of staic variable 
//     //     // college = "Techno" 
//     // } 
// }   

// static method belongs to the class  
// static method can call without the object 
// static method cannot acess the non static variable and method       

// static block run once when class loads    and also use set the value of static variable 


// final keyword   
// --> The final keyword means something cannot be channed or overridden after it is defined 
// It can be used with 
// variable 
// Methods 
// Classes  
 
// final Variable 
// A final variable is a constant  
// once a value is assigned ,it cannot be changed     

// final method  
// A final method cannot be overridden in a child class  
// in inhertiance method can be overriding 
// final stop overriding  
// class A{
//     final void show(){
//        System.out.println("This is final method");
//     }  
// } 
// class B extends A{
    //  void show() {}  // give the error cannot the modify the final method   

    // parent class says  This method must stay exactly the same  
// }  

// 4 final class cannot be inherited    


// keypoint of static  
// Static Variables (Class Variables): A single copy is shared among all objects, ideal for representing common properties like counter variables or constants.  

// 2 . Static Methods: Can be called without creating an object instance, typically used for utility or helper methods, such as {Link: Math.sqrt()  

// 3. Static Blocks: Executed only once when the class is loaded into memory, commonly used for initializing static variables.   

// Static Nested Classes: Can be created without an outer class instance.  

// Cannot Use this or super: Static context does not permit the use of this or super keywords.




  



