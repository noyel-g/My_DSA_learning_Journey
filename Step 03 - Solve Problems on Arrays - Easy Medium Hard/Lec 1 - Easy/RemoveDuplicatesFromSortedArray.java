public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
       int [] arr={0,0,1,1,1,1,2};
       int n=removeDuplicates(arr);
       for(int i=0;i<n;i++){
        System.out.print(arr[i] +" ");
       }
    }
     public  static int removeDuplicates(int[] nums) {
        int len=nums.length;
        int i=0,j=1; 
       while(j<len){
        if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
        } 
        j++;
       }
       return i+1;
    }
}
