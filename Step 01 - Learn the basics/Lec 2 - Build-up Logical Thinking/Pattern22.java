/* 
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/

import java.util.Scanner;

public class Pattern22{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int l=n+(n-1);
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
               for(int k=0;k<n;k++){
                if((i==k||j==(l-k-1))||(i==(l-k-1)||j==k)){
                    System.out.print(n-k);
                break;
                }
               }
              }
            System.out.println();
            }
          sc.close();
    }
}