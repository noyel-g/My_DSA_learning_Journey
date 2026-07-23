/*Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left. */

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextInt()));
        sc.close();
    }

public static boolean isPalindrome(int x) {
       int num=x;
       int rev=0;
       while(x>0||x<0){
        int rem=x%10;
        x=x/10;
        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return false; 
            }
        rev=rev*10+rem;
       }
       return rev==num;
    }
}
