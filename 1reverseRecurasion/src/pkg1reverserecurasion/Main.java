/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1reverserecurasion;
import java.util.Scanner;
/**
 *
 * @author asias
 */
public class Main {

   public static void reverseMethod(int number)
   {
       if(number<10){
           System.out.print(number);
           return;
       }
       else{
       System.out.print(number%10);
       reverseMethod(number/10);
       }
       //Method is calling itself recursion
  
   
   }
    public static void main(String[] args)
    {
        int num=0;
         System.out.println("Input your number and press enter: ");
         Scanner in = new Scanner(System.in); 
         num=in.nextInt();
          System.out.print("Reverse of the input is: ");
          reverseMethod(num);
          System.out.println();
          
        
    }
    
}
