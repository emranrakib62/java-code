
public class NestedTryCatch {
    public static void main(String[] args) {
        try{
        try{
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(""+c);
        
        }catch(ArithmeticException ie){
            System.out.println(""+ie);
        }catch(NullPointerException ie){
            System.out.println(""+ie);
        
        }
        }catch(Exception ie){
            System.out.println(""+ie);
        
        }
        
    }
}
