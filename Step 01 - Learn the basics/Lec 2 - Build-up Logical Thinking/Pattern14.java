/* 
A
A B
A B C
*/

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=0;i<n;i++){
        char c='A';
            for(int j=0;j<i+1;j++){
               System.out.print(c+" ");
               c++;
            }
            System.out.println();
        }
       
          sc.close();
    }
}