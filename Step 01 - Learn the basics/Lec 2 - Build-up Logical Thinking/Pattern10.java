/*Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output: 

*
**
***
**
*

*/

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

       for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
               System.out.print('*');
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
               System.out.print('*');
            }
            System.out.println();
        }
          sc.close();
    }
}
