public class ReverseAnArray {
    public static void main(String[] args) {
       int [] arr={1,3};
       reverseArray(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void reverseArray(int arr[]) {
       int length=arr.length;
       for(int i=0;i<arr.length/2;i++){
        int temp=arr[i];
        arr[i]=arr[length-1-i];
        arr[length-1-i]=temp;
       }
    }
}
