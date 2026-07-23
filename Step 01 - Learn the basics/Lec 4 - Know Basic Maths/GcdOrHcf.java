/*Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

Examples:

Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5. */

import java.util.Scanner;

public class GcdOrHcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[2];
       arr= lcmAndGcd(sc.nextInt(),sc.nextInt());
       for (int i : arr) {
        System.out.println(i);
       }
       sc.close();

    }
        static int[] lcmAndGcd(int a, int b) {
        int LCM =1;
        int GCD=1;
        int div=0;
        boolean c=true;
        while(c){
            int count=0;
            for(int i=2;i<=Math.min(a,b);i++){
                if(a%i==0&&b%i==0){
                    if(GCD<i) 
                    GCD=i;
                    div=i;
                    count++;
                }
            }
            if(count>0){
                    LCM=LCM*div;
                    a=a/div;
                    b=b/div;
                }
            
            if(count==0){
                LCM=LCM*a*b;
                c=false;
            }
        }
  
        return new int[] {LCM,GCD};
    }
}
