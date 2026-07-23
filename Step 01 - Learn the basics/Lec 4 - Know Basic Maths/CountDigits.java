/* Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0
*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int digit= sc.nextInt();
            int c=digit;
            int count=0;
           while(c>0){
            int rem= c%10;
            c=c/10;
            if(digit%rem==0){
                count++;
            }
           }
           System.out.println(count);
sc.close();

    }

}
