/**
 * InsertionSort
 */
public class RecursiveInsertionSort {
public static void main(String[] args) {
       int [] arr={4,8,1,9,0};
       int j=1;
       insertionSort(arr,j);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void insertionSort(int arr[],int num) {
       int len=arr.length;
       int j=num;
       if(num==len)
       return;
           int temp=arr[j];
           while(j>0&&(arr[j-1]>temp)){
               arr[j]=arr[j-1];
               j=j-1;
           }
           arr[j]=temp;
           insertionSort(arr, num+1);
       }
    
}