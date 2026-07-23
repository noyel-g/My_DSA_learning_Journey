/*Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

For every value of ‘N’, print the field if the trees are represented by ‘*’.

Example:
Input: ‘N’ = 3

Output: 
* * *
* *
*

*/

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
         System.out.print("* ");
         }
         
        System.out.println();
    }
        sc.close();
    }
}
