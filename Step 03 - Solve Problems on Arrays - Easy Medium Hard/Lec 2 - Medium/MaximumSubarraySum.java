public class MaximumSubarraySum {
    public static void main(String[] args) {
       int [] arr={-1,0,-1,1,-1,1,1};//array must have majority element else it will fail
      System.out.println(maxSubArray(arr));      
    }

    public static int maxSubArray(int[] nums) {
          int len=nums.length;
          int currsum=nums[0];
          int maxsum=nums[0];
            for(int i=1;i<len;i++){
              currsum=Math.max(currsum+nums[i],nums[i]);
              maxsum=Math.max(currsum,maxsum);
            }  
        
        return maxsum;
    }
}
