/* This program asks for user input and uses 
FibonacciSolver constructor to find the nth Fibonacci number.*/

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci_user_test
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int n = 0;
      boolean check = false;
      
      /*Use a while loop with exception handling to ask the user to input an integer.
      If an integer is not entered, then an exception is thrown and the check condition
      remains false.*/
      while(check != true)
      {
         try
         {
            System.out.println("Enter an integer 'n' for finding the nth Fibonacci number.");
            n = input.nextInt();
            
            //If n is an integer, exit the loop by setting check to true.
            check = true;
         }
         catch(InputMismatchException e)
         {
            input.nextLine();
            System.out.println("Exception thrown :" + e);
            System.out.println("Not an integer, please try again.");
         }
      } 
      
      //Create FibonacciSolver object.
      FibonacciSolver output = new FibonacciSolver(n);
      
      //Create an array with long values using method from Fibonacci Solver.
      long[] num = output.NthFibonacci();
      
      System.out.println("The " + n + "th Fibonacci number is " + num[n-1]);
      
   }
}