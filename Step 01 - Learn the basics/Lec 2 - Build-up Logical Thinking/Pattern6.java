/* Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.

Example:
Input: ‘N’ = 3

Output: 

1 2 3
1 2
1
*/

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
         for(int j=1;j<=n-i;j++){
         System.out.print(j+" ");
         }
         
        System.out.println();
    }
        sc.close();
    }
}
