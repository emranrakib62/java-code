
public class Demo1 {
    public static void main(String[] args) {
         A1223 a1= new  A1223();
         AAA a2=new AAA();
         Thread t1=new Thread(a1);
         Thread t2=new Thread(a2);
         t1.start();
          t2.start();
    }
}
