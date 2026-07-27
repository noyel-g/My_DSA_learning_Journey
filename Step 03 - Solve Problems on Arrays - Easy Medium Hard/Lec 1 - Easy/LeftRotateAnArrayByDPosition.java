public class LeftRotateAnArrayByDPosition {
    public static void main(String[] args) {
       int [] arr={10,9,8,7,6,5,4,3,2,1};
       rotate(arr,2);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
    public static void rotate(int[] nums, int k) {
    int len=nums.length;
    k=k%len;
    reverse(nums,0,len-1);
    reverse(nums,0,k-1);
    reverse(nums,k,len-1);
    }

   private static void reverse(int[] nums,int left, int right){
    while(left<right){
     int temp=nums[left];
     nums[left]=nums[right];
     nums[right]=temp;
     left++; right--;
    }
   }
}
