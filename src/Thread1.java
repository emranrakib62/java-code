
public class Thread1 extends Thread{
    Table1 t;
    Thread1(Table1 t){
        this.t=t;
    }
    public void run(){
        synchronized(t){
            t.printtable(10);
        }
       
    }
}
