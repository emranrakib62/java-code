
public class Thread2 extends Thread {
    Table t;  	// Declaring t as class type table
Thread2(Table t){
 this.t = t;  
}  
public void run(){
  t.printTable(10);  
 }  


}
