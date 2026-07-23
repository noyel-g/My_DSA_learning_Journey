/*Given a number x, the task is to print the numbers from x to 0 in decreasing order in a single line. */

import java.util.Scanner;
public class WhileLoop{
public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int n=sc.nextInt();
      utility(n);
	  sc.close();	
	}

	
   static void utility(int x) {
       while(x>=0){
           System.out.print(x+ " ");
           x--;
       }
        
    }
}