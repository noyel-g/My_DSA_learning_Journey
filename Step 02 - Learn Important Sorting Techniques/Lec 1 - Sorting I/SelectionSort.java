/**
 * SelectionSort
 */
public class SelectionSort {
public static void main(String[] args) {
       int [] arr={4,8,1,9,0};
       selectionSort(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
     public static void selectionSort(int[] arr) {
        
        int len=arr.length;
       for(int i=0;i<len;i++){
           int min=i;
           for(int j=i+1;j<len;j++){
               if(arr[min]>arr[j]) min=j;
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
       }
        
    }
}