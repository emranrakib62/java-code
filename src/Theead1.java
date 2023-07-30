
public class Theead1 extends Thread {
  Table t;      // Declaring t as class type table
                  // Declaring parameterized constructor and passing variable t as a parameter to the thread.
Theead1(Table t){
 this.t = t;  
}  
public void run(){
 t.printTable(2);  
 }  

 
}
