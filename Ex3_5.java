/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_5;

import java.util.Scanner;

/**
 *
 * @author SCC
 */
public class Ex3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter num1= ");
        num1 = input.nextDouble();
       
        System.out.println("Enter num2= ");
        num2 = input.nextDouble();
        
        System.out.println("Enter num3= ");
        num3 = input.nextDouble();
   
        
        if ((num1 == num2) && (num2 == num3) && (num1 == num3))
        {
            System.out.println("All the same");
        }
        else if ((num1 != num2) && (num2 != num3)&& (num1 != num3))
        {
            System.out.println("All different");
        }
        else
        {
            System.out.println("Neither");
        }
    }
    
}
