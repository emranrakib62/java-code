import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the number a:");
        a=sc.nextInt();
        System.out.println("enter the number b:");
        b=sc.nextInt();
        System.out.println("enter the number c:");
        c=sc.nextInt();
        int big=(a>b&&a>c)?(a):(b>c)?(b):(c);
        System.out.println("the big number:"+big);
        
    }}      

        
    
             
