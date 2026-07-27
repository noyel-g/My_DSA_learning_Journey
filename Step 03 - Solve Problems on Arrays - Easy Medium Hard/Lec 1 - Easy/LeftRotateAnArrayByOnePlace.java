/**
 * LeftRotateAnArrayByOnePlace
 */
public class LeftRotateAnArrayByOnePlace {
   public static void main(String[] args) {
       int [] arr={10,9,8,7,6,5,4,3,2,1};
       rotate(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void rotate(int[] arr) {
        int len=arr.length;
        int temp =arr[len-1];
        for(int j=len-1;j>0;j--){
          arr[j]=arr[j-1];
        }
        arr[0]=temp;
    }
}