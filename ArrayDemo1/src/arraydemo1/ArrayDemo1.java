/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo1;

import java.util.Scanner;

/**
 *
 * @author erikkristiansen
 */
public class ArrayDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int EMPLOYEES = 3;
        int[] hours = new int [EMPLOYEES];
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");
        
        System.out.println("Employee 1: ");
        hours[0] = keyboard.nextInt();
        
        System.out.println("Employee 2: ");
        hours[1] = keyboard.nextInt();
        
        System.out.println("Employee 3: ");
        hours[2] = keyboard.nextInt();
        
        System.out.println("The hours you entered are: ");
        System.out.println(hours[0]);
        System.out.println(hours[1]);
        System.out.println(hours[2]);
        
    }
    
}
