public class Abstraction {
    public static void main(String[] args) {
      Car c1 = new ElectricCar();
      c1.start();
      c1.acceralate();
      c1.brake();   
    }
}

// ------------notes ----------------

// Abstraction in java is one of the core concept of object oriented programming  (oops) it means hiding  the internal implementation details and showing only the essentail features of an object 

// In java Abstraction is achieved by 2 method 
// 1. Abstract class  
// 2. interfaces   

// Abstract class  
// cannot be instantaited (object of this class cannot created )
// and is used to provide a base structure for other class 
// feature 
// cannot create object 
// can have the Abstract methods
// can have normal methods 
// if a class abstract method , then child class must implement them 
 
// Note -> java have the concept of upcasting  
// converting a child class object into a parent class refernce 
// parent obj = new child();

abstract class Car{
    void start(){
        System.out.println("car is started");
    }
    abstract void acceralate(); 
    abstract void brake();

}   
class ElectricCar extends Car{ 
     @Override
     void acceralate(){
        System.out.println("ElectricCar is acceralate");
     } 
     @Override 
     void brake(){
        System.out.println("brake the ElectricCar");
     }
}
class fuelCar extends Car{
    @Override
    void acceralate(){
        System.out.println("fuelCar acceralate");
    }   
    @Override
    void brake(){
        System.out.println("fuelCar brake");
    }
}