/**
 * FindMissingNumberInAnArray
 */
public class FindMissingNumberInAnArray {
   public static void main(String[] args) {
       int [] arr={0,1,2};
       int n=missingNumber(arr);
       System.out.println(n);
    }
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum-nums[i];
        }
        return sum;
    }
}