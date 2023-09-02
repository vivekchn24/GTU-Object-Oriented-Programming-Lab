/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author stu_second
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       {
       
                System.out.println("enter the first value");
        double x=input.nextDouble();
        
                   System.out.println("enter the second value");
                     double y=input.nextDouble();
        
                     System.out.println("enter the third value");
                       double z=input.nextDouble();
        if(x>y)
        {
            System.out.println("first value is bigger");
        }
         if(y>z) 
         {
        System.out.println("second value is bigger");
         }
        if(z>x)
        
        {
        System.out.println("third value is bigger");
        }
        
        else{
        System.out.println("no value is bigger");
                }
       }
       
        
                
        // TODO code application logic here
    }
    
}
