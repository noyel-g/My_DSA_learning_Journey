/* 
1
2 3
4 5 6
*/

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int count=1;
       for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
               System.out.print(count+" ");
               count++;
            }
            System.out.println();
        }
       
          sc.close();
    }
}
