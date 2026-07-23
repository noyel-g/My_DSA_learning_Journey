/*  Given a positive integer n, The task is to find the value of Σi F(i) where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.

Examples:

Input: n = 4
Output: 15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
So, F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7 = 15
      */

import java.util.Scanner;

public class PrintAllDivisors {
    
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println(sumOfDivisors(sc.nextLong()));
  sc.close();
}


  public static long sumOfDivisors(long n) {
        // code here
        int value=0;
        for(int i=1;i<=n;i++){
            value=value+function(i);
        }
        return value;
    }
    public static int function(int num){
        int value=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                value=value+i;
            }
        }
        return value;
    }
}
