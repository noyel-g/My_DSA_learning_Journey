import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printGFG(n);
        sc.close();
    }
        public static void printGFG(int n){
            if(n==0){
                return;
            }
            printGFG(n-1);
            System.out.print("GFG ");
        }
}
