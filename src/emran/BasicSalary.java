
package emran;
import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);   
        double bs,gs,hra,da;
        System.out.println("enter the basic salary:");
        bs=sc.nextDouble();
        if(bs>=10000){
            hra=bs*(20/100);
            da=bs*(80/100);
        }
      else  if(bs>=20000){
             hra=bs*(25/100);
            da=bs*(90/100);
        }
       else if(bs>=30000){
             hra=bs*(30/100);
            da=bs*(95/100);
       }
        
        gs =(bs+hra+da);
        System.out.println("the gross salary:"+gs);
        
        
    sc.close();
    }
}
