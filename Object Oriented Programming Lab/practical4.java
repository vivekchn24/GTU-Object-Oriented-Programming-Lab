/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author stu_second
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your weight");
        double kg=input.nextDouble();
       double pound=45359237*kg;
        System.out.println("enter your height");
        double meters=input.nextDouble();
        double inch=0254*meters;
        System.out.println(pound);
         System.out.println(inch);
        
        // TODO code application logic here
    }
    
}
