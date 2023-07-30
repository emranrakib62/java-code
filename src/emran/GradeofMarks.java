
package emran;

import java.util.Scanner;
public class GradeofMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        int a,b,c,d,e,p;
         System.out.println("enter the first angle:");
        a= sc.nextInt();
        System.out.println("enter the 2nd angle:");
        b= sc.nextInt();
        System.out.println("enter the third angle:");
        c= sc.nextInt();
         System.out.println("enter the third angle:");
        d= sc.nextInt();
         System.out.println("enter the third angle:");
        e= sc.nextInt();
        int t=a+b+c+d+e;
        p=(t/500)*100;
        if(p>=90){
          System.out.println("grade A");  
        }
         else if(p>=80){
          System.out.println("grade B");  
        }
        else  if(p>=70){
          System.out.println("grade c");  
        }
        else if(p>=60){
          System.out.println("grade D");  
        }
         else  if(p>=40){
          System.out.println("grade E");  
        }
         else  if(p<40){
          System.out.println("grade F");  
        }
          
          
        sc.close();
    }
 
}
