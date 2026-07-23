/*

1
0 1
1 0 1

*/
       
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
      //  int start=1;
    //    for(int i=0;i<n;i++){
    //     if(i%2==0){
    //       start=1;
    //     }
    //     else start=0;
    //     for(int j=0;j<i+1;j++){
    //     System.out.print(start);
    //     start=start^1;
    //     }
    //         System.out.println();
    //     }

    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
        if((i+j)%2==0){
        System.out.print(1+ " ");
        }
        else 
             System.out.print(0+ " ");
       
        }
        System.out.println();
         
    }
     sc.close();
}}
