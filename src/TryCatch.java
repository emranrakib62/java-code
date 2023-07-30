
public class TryCatch {
    public static void main(String[] args) {
        
        try{
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(""+c);
        
        }catch(ArithmeticException ie){
        
            System.out.println(""+ie);
        }
        catch(Exception e){
            System.out.println(""+e);
        }
    }
}
