/*This program is for computing the nth Fibonacci number.*/

import java.io.*;

public class FibonacciSolver
{
   int n;
   
   //Instance variable 'n' dictates the size of the array.
   
   public FibonacciSolver(int n)
   {
      this.n = n;
   }
   
   //Create the main method to compute the Fibonacci numbers.
   public long[] NthFibonacci()
   {
      long output[] = new long[n];
    
      /*Initialize the first two indices in the array to
      the first two Fibonacci numbers.*/
      output[0] = 0;
      output[1] = 1;
    
      /*If n > 2, then find the Fibonacci numbers up to n
      and assign them to an index in the array.*/
      for(int i = 2; i < n; i++)
      {
        output[i] = output[i - 1] + output[i - 2];
      }
    
      //Finally, return the array.
      return output;
   }
}