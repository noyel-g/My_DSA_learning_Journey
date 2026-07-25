public class BubbleSort {
    public static void main(String[] args) {
       int [] arr={4,8,1,9,0};
       bubbleSort(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void bubbleSort(int[] arr) {
        int len=arr.length;
        boolean swapped;
        do {
            swapped=false;
        for(int i=0;i<len-1;i++){
              if(arr[i]>arr[i+1]){
                  int temp=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
                  swapped=true;
              }
     
        }
        len=len-1;
    }while(swapped);
        
    }
}
