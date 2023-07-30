
public class Demo {
    public static void main(String[] args) {
        ExtendingThread s1=new ExtendingThread();
        ExtendingThread1 s2=new ExtendingThread1();
        s1.start();
        s2.start();
    }
}
