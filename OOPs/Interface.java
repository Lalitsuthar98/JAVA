public class Interface {
    public static void main(String[] args) {
        Car c1  = new ElectricCar();
        c1.start();
        c1.acceralate();
        c1.brake();
    }
}

// ----------------Notes--------------------
 
// Interface  
// An interface is a blueprint of a class that 
// provides 100% abstraction 
// contains only method declaration(no implementation) 
// interface tell WHAT TO DO , not HOW to do 

// rule of interace 
// method are public and abstract by default  
// variable are public static final 
// cannot create object of interface 
// class uses implement  ,not extend  

interface Car{
    void start();
    void acceralate();
    void brake();
}  

class ElectricCar implements Car{
    @Override 
    public void start(){
        System.out.println("ElectricCar is started"); 
    }  

    @Override 
    public void acceralate(){
        System.out.println("ElectricCar is acceralated");
    }    
    @Override 
    public void brake(){
        System.out.println("ElectricCar apply brake");
    }
}