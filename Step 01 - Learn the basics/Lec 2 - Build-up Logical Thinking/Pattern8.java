/*Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

*****
 ***
  * 
  
 */

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*n-2*(i+1);k++){
               System.out.print('*');
            }
            System.out.println();
        }
         
        // for(int i=n;i>0;i--){
        //     for(int j=i;j<=n-1;j++){
        //      System.out.print(" ");
        //     }
        //     for(int k=((i-1)*2)+1;k>0;k--){
        //      System.out.print('*');

        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
