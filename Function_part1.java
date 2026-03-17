class demo{
        int add(int a ,int b){
            return a+b;
        }
         int add(int a,int b,int c){
            return a+b+c;
        }  

        demo Show(){
            System.out.println("show Method");
            return this;
        }
        demo display(){
            System.out.println("Display Method");
            return this;
        }
        void print(){
            System.out.println("last method call by chaining");
        }
      }
public class Function_part1 {
      
    // static void greet(){
    //     System.out.println("Hello Lalit Suthar");
    // }  

    // static int add(int a , int b){
    //     return a+b;
    // } 
    // static int fact(int num){
    //     if(num == 1){
    //         return 1;
    //     }
    //     return num * fact(num-1);
    // }
    public static void main(String[] args) {
        // Afunction is a block of code that perform a specific task and can be called whenever needed  
    //     greet();
    //     System.out.println(add(10,20)); 
         // in java ,function must be inside a class    
         // java does not allow standalone function like C/C++
        //  public static void main(String[] args) 
        // public          --> accessible everywhere 
        // static          --> called without object 
        // void            --> no return 
        // main            --> starting function 
        // String[] args   --> command line argument    

        // recursion 
        // code of factorial 
        // int ans = fact(5); 
        // System.out.println(ans);  

        // Function overloading   
        // --> Method Ovverloading means multiple methods haveing the same name but different parameters in a same class 
        // The compiler decides which method to call based on the parameters   
        // demo obj1 = new demo();
        // System.out.println(obj1.add(10, 20));  
        // System.out.println(obj1.add(10,20,30));     

        // Chaining  
        // --> Method chaining means calling multiple method in a single statement  
        // Each method returns an object refernce, allowing the next method to be called   
        
        demo obj1 = new demo();  
        obj1.Show().display().print();  // chaining 


     }
}
