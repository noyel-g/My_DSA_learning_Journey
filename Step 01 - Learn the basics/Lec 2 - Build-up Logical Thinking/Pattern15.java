/* 
A B C
A B
A
*/

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=0;i<n;i++){
        char c='A';
            for(int j=i;j<n;j++){
               System.out.print(c+" ");
               c++;
            }
            System.out.println();
        }
       
          sc.close();
    }
}