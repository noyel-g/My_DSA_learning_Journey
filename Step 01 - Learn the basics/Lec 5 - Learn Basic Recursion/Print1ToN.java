import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printTillN(sc.nextInt());
       sc.close();
    }
  static void printTillN(int n) {
     if(n==0){
         return ;
     }
     printTillN(n-1);
     System.out.print(n+" ");
    }   
}
