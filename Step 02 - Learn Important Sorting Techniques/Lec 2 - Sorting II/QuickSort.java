/**
 * QuickSort
 */
public class QuickSort {
public static void main(String[] args) {
       int [] arr={10,9,8,7,6,5,4,3,2,1};
       quickSort(arr,0,arr.length-1);
       for (int i : arr) {
        System.out.print(i+ " ");
       } 
    }
    public static void quickSort(int[] arr, int low, int high) {
       if(high<=low) return;
       int pivot=partition(arr,low,high);
       quickSort(arr,low,pivot-1);
       quickSort(arr,pivot+1,high);
    }

    private static int partition(int[] arr, int low, int high) {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
        
    }
    
}