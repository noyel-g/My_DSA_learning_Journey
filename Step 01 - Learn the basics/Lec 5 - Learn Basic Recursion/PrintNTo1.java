import java.util.Scanner;

/**
 * PrintNTo1
 */
public class PrintNTo1 {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       printNos(sc.nextInt());
       sc.close();
    }
     static void printNos(int n) {
    if(n==0)
    return;
    System.out.print(n+" ");
    printNos(n-1);
        
    }
}