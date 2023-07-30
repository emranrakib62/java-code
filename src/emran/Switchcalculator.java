
package emran;
import java.util.Scanner;

public class Switchcalculator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int x,y;
      System.out.println("enter the x:");
      x=sc.nextInt();
      System.out.println("enter the y:");
      y=sc.nextInt();
      System.out.println("enter the oparator(+,-,*,/):");
      char operator=Scanner.next().charAt(0);
      
      sc.close(); 
      int output;
      switch(operator){
          case '+':
              int s=x+y;
            System.out.println(x+"+"+y+"="+s);
            break;
        case '-':
              int a=x-y;
            System.out.println(x+"-"+y+"="+a);
            break;
         case '*':
              int b=x*y;
            System.out.println(x+"*"+y+"="+b);
            break;
          case '/':
              int c=x/y;
            System.out.println(x+"/"+y+"="+c);  
           break;
           
          default:
           System.out.println("wrong");    
          
       } 
 
    }
}
