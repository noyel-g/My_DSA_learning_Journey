
public class MergeSort {
    public static void main(String[] args) {
       int [] arr={4,8,1,9,0};
       mergeSort(arr,0,4);
       for (int i : arr) {
        System.out.print(i+ " ");
       } 
    }
    public static void mergeSort(int arr[], int l, int r) {
        if(l>=r) 
        return;
        int middle=((r-l)/2)+l;
        mergeSort(arr,l,middle);
        mergeSort(arr,middle+1,r);
        merge(arr,l,middle,r);
    }
    private static void merge(int[] arr,int l,int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
            
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
            
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            } else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        
    }
}
