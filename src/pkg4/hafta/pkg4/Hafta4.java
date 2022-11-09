
package pkg4.hafta.pkg4;

import java.util.Scanner;

public class Hafta4 {

   
    public static void main(String[] args) {
        int a,b,n;
         Scanner input = new Scanner(System.in);
         
        System.out.println("Enter here pay value");
        a = input.nextInt();
        
          System.out.println("Enter here payda value ");
        b = input.nextInt();
        
        System.out.println("Enter the number you want");
           n = input.nextInt();
           
       
        
        for(int i=1; i<=n ;i++){
            
        a= 10 * a;
        int c = a/b;
        a= a % b;
        
          System.out.println("C value is= "+ c);
        } 
    }
    
}