public class SecondLargestElementInAnArrayWithoutSorting {
    public static void main(String[] args) {
       int [] arr={10,11,8,7,6,5,4,3,2,1};
       System.out.println(getSecondLargest(arr));
       
    }
     public static int getSecondLargest(int[] arr) {
        int max=0;
        int second=-1;
        for(int i: arr){
            if(i>max){
                max=i;
            }
        }
         for(int i: arr){
            if(i>second&&i<max){
                second=i;
            }
        }
        return second;
    }
}
