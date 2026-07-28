/**
 * BinarySearch
 */
public class BinarySearch {
public static void main(String[] args) {
       int [] arr={0,1,2,3,4,5};
       System.out.println(binarySearch(arr,5));
    }
    public static boolean binarySearch(int[] arr, int k) {
    int len =arr.length;
    int low = 0;
    int end = len-1;
    while(low<=end){
    int middle=low+(end-low)/2;
    if(arr[middle]==k){ 
        return true; }
    if(k<arr[middle]){
      end=middle-1;
    } else low=middle+1;
    }
    return false;
}
}