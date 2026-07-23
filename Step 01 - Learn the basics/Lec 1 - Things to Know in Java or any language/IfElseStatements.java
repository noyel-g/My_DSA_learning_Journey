/*Given two integers, n and m. The task is to check the relation between n and m.
 Print "less" if n < m,  "equal" if n == m, and "greater" if n > m. */


import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<m)
        System.out.println("less");
        else if (n>m)
        System.out.println("greater");
        else 
        System.out.println("equal");
    sc.close();
    }
}