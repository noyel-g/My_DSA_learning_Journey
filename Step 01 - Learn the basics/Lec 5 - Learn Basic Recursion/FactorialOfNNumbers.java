import java.util.ArrayList;
import java.util.Scanner;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       for (Long l : factorialNumbers(sc.nextLong())) {
         System.out.print(l+" ");
       } ;
       sc.close();
    }
    static ArrayList<Long> factorialNumbers(long n) {
    ArrayList<Long> l=new ArrayList<>();
    int start=1;
    while(start>0){
        if(fact(start)<=n){
            l.add(fact(start));
            start++;
        }
        else
        break;
    }
    return l;
    }
    static long fact(int n){
        if(n==0||n==1)
        return 1;
        if(n==2)
        return 2;
        return n*fact(n-1);
    }
}
