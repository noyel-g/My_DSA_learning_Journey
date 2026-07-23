/*  Question : 
Problem statement
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.

Example:
Input: The character is 'a'.

Output: 
Explanation: The input character is lowercase, so our answer is 0. */


/*  The Scanner class in Java is a utility from the java.util package that makes it easy to read input from the keyboard, files, strings, or streams. It breaks input into tokens using delimiters (default: whitespace) and provides methods to convert them into primitive types or strings.
      Can read from console (System.in), files, strings, or streams.
    | Method | Description | Example |
| --- | --- | --- |
| ``nextInt()`` | Reads an integer | ``int ``x ``= ``sc.nextInt();`` |
| ``nextDouble()`` | Reads a double | ``double ``d ``= ``sc.nextDouble();`` |
| ``nextLine()`` | Reads an entire line | ``String ``s ``= ``sc.nextLine();`` |
| ``next()`` | Reads a single word | ``String ``word ``= ``sc.next();`` |
| ``hasNext()`` | Checks if another token exists | ``while(sc.hasNext())`` |
| ``useDelimiter(String ``regex)`` | Changes delimiter | ``sc.useDelimiter(",\\\\s*");`` |
*/
import java.util.Scanner;
public class UserInputOutput {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
    char ch =sc.next().charAt(0);
    if(ch>='A' && ch<='Z'){
      System.out.println(1);
    } else if( ch>='a' && ch<='z'){
        System.out.println(0);
    } else {
        System.out.println(-1);
    }
     sc.close();   
    }
}
