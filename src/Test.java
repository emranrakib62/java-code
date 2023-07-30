
public class Test {
    public static void main(String[] args) {

// Creating an object of Table class.	
    Table s = new Table();
    Theead1 t1=new Theead1(s);
      Thread2 t2=new Thread2(s);
      t1.start();
      t2.start();
 }

}
