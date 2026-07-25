/**
 * InsertionSort
 */
public class InsertionSort {
public static void main(String[] args) {
       int [] arr={4,8,1,9,0};
       insertionSort(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void insertionSort(int arr[]) {
       int len=arr.length;
       for(int i=1;i<=len-1;i++){
           int j=i;
           int temp=arr[j];
           while(j>0&&(arr[j-1]>temp)){
               arr[j]=arr[j-1];
               j=j-1;
           }
           arr[j]=temp;
       }
    }
}