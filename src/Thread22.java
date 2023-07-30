
public class Thread22 extends Thread {
    Table1 t;
    Thread22(Table1 t){
        this.t=t;
    }
    public void run(){
        
       synchronized(t){
            t.printtable(10);
        }
    }
}
