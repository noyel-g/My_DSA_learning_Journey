/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321 */

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(reverse(sc.nextInt()));
        sc.close();
    }

public static int reverse(int x) {
       int rev=0;
       while(x>0||x<0){
        int rem=x%10;
        x=x/10;
        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0; 
            }
        rev=rev*10+rem;
       }
       return rev;
    }}
