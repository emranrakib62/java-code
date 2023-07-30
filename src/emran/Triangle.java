
package emran;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);   
        int a,b,c;
         System.out.println("enter the first angle:");
        a= sc.nextInt();
        System.out.println("enter the 2nd angle:");
        b= sc.nextInt();
        System.out.println("enter the third angle:");
        c= sc.nextInt();
       
        if(a>0 && b>0 && c>0 && a+b+c==180 ){
           System.out.println("trangle is valid"); 
        }
        else{
       System.out.println("trangle is invalid"); 
        } 
        
 sc.close();
    }
    
}
