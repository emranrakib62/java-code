
public class A1 extends Thread{
    A t;      // Declaring t as class type table
                  // Declaring parameterized constructor and passing variable t as a parameter to the thread.
A1(A t){
 this.t = t;  
}  
public void run(){
 t.printTable(2);  
 }  
}

