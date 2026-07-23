/*Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
***** 

*/

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
             System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
             System.out.print('*');

            }
            System.out.println();
        }
       



        /* 
         int star=-1;
         int count=n-1;for(int i=0;i<n;i++){
         star=star+2;
         printSpace(count);
         printStar(star);
         count--;
         System.out.println();
         }
        
        sc.close();
    }
    static void printSpace(int n){
        for(int i=0;i<n;i++){
            System.out.print(" ");
        }
    }
    static void printStar(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }*/
       sc.close();
    } 
}
