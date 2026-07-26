public class RecursiveBubbleSort {
    public static void main(String[] args) {
       int [] arr={4,8,1,9,0};
       recursivebubbleSort(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void recursivebubbleSort(int[] arr) {
    bubbleSortHelper(arr,arr.length);
    }
     private static void bubbleSortHelper(int[] arr, int len){
        if(len==1)
        return;
        for(int i=0;i<len-1;i++){
              if(arr[i]>arr[i+1]){
                  int temp=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
                }
        }
      bubbleSortHelper(arr,len-1);    
     }
}
