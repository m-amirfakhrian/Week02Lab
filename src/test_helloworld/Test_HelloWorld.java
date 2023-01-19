/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_helloworld;

import java.util.Scanner;

/**
 *
 * @author Majid
 */
public class Test_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a positive integer number");
        int n = myObj.nextInt(); 
        if(n>0){
        double sum=0.0;
        for(int i = 1; i<= n; i++){
           sum+= 1.0/i;    
        }
        System.out.printf("Sum 1/i for i=1 to %d is %f \n",n,sum);
    }
        else System.out.println("The number is incorrect!");
    }
    
    
}
