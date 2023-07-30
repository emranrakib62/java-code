
public class A12 {
    public static void main(String[] args) {
        
    
    try{
    int a=5;
    int b=0;
    int c=a/b;
}catch(ArithmeticException e){
            System.out.println(e);
}
  try{  
    
    int a[]=new int[3];
    a[0]=1;
    a[1]=2;
    a[2]=3;
    a[3]=7;
  }
    catch(ArrayIndexOutOfBoundsException ie){
    System.out.println(ie);
}
    
    
    finally{
        
    
        System.out.println("last line of the program ");
    }
}
    }

