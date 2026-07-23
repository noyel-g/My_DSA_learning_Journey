import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println(isAmstrong(sc.nextInt()));
       sc.close();
    }
    public static boolean isAmstrong(int n){
        //count the number of digits in n
        List<Integer> l =new ArrayList<>();
        double value=0;
        int count=0;
        int temp=n;
        while (temp != 0) {
        int rem=temp%10;
        temp /= 10;  
        l.add(rem);
        count++;      
     }
     for (Integer digit : l) {
       value = value+Math.pow(digit, count);
     }
     return value==n;
     
    }
}
