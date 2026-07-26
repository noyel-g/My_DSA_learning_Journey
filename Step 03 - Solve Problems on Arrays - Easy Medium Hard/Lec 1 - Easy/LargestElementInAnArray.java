
public class LargestElementInAnArray {
    public static void main(String[] args) {
       int [] arr={10,9,8,7,6,5,4,3,2,1};
       System.out.println(largest(arr));
       
    }

    public static int largest(int[] arr) {
        int max=0;
        for(int i: arr){
            if(i>max){
                max=i;
            }
        }
        return max;
        
    }
}
