/*
    A
  A B A
A B C B A 
*/

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n ; i++){
            for(int j=0;j<2*(n-1-i);j++){
           System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
            System.out.print((char)('A'+j)+" ");
            }
            for(int j=i;j>0;j--){
            System.out.print((char)('A'+(j-1))+" ");
            }
            System.out.println();
        }
          sc.close();
    }
}