// public class Object_size {
//     public static void main(String[] args) {
        
//     }
// }

// -----------Notes-----------------

// Object size 
// --> the amount of memory reqiured to store an object in heap memory 

// when object is created  
// Student s = new Student();
// Memory is allocated in Heap , and variable (s) stores a refernce (address) of that object 
// Memory Structure  

// stack                           Heap memory 
//    s -------------->            Student object
                                        //   id  
                                        //   name          
                                        //   marks 
                                        //   college
// Component of Object Memory 

// A java object contains three main parts  
// 1. Object Header 
// Every object has a header that stores Jvm information 
// Header contains  
// 1. mark word   8 byte 
// 2. class pointer --> refernce  (4/8 byte)  we assume 4 byte 

// totol byte   --> 12 byte 

// 2. Instance Variables  
// filed which are declared in class  
// id, name, age , marks  

// 3 padding (ALignment)

// Jvm aligns object to 8 byte boundaries to cpu optimization 

// so if object size become not multiple of 8 Jvm adds padding bytes  

// Example  
// Header = 12
// boolean = 1
// Total = 13  
// then 3 byte are add to make 8 multiple  
// Then 16 bit 
