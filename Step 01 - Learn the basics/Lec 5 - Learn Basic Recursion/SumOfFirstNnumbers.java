import java.util.Scanner;

public class SumOfFirstNnumbers {
        static double value=0;
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumOfSeries(sc.nextInt());
        System.out.println((int)value);
        sc.close();
    }
        static void sumOfSeries(int n) {
        if(n==0)
        return ;
        sumOfSeries(n-1);
        value=value+(Math.pow(n,3));   
    }
}
