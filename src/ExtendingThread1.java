
public class ExtendingThread1 extends Thread {
    public void run(){
         for(int i=0;i<10;i++){
            
        
        System.out.println(""+i);
        
    } try{
    sleep(2000);
}catch(InterruptedException e){
            System.out.println(e);
}
    }
}
