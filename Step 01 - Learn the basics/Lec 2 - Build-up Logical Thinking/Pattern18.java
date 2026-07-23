/* 
C
C B 
C B A
*/

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
              System.out.print((char)('A'+n-(j+1))+" ");
            }
            System.out.println();
        }
       
          sc.close();
    }
}