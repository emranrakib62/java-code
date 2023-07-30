
public class A2 extends Thread {
    A t;  	// Declaring t as class type table
A2(A t){
 this.t = t;  
}  
public void run(){
  t.printTable(10);  
 }  
}

