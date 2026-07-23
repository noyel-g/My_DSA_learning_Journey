import java.util.Arrays;

/**
 * PassBy  Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.

Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.
 */
public class PassBy {

    public static void main(String[] args) {
    int[] arr=passedBy(1, 02);
    System.out.println(Arrays.toString(arr));
        
    }
    static int[] passedBy(int a, int b) {
       return new int[]{a+1,b+2};
    }

}