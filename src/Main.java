
public class Main {
    public static void main(String[] args) {
        Table1 ob=new Table1();
        Thread1 s=new Thread1(ob);
        Thread22 s1=new Thread22(ob);
        s.start();
        s1.start();
    }
}
