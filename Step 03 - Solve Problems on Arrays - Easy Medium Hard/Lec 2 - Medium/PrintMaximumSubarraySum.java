
//updated version of MaximumSubArraySum here instead of finding the sum we print the subarray which gives max sum
public class PrintMaximumSubarraySum {
    public static void main(String[] args) {
       int [] arr={-1,-1,1,0,1};//array must have majority element else it will fail
      maxSubArray(arr);      
    }

    public static void maxSubArray(int[] nums) {
          int len=nums.length;
          int currsum=nums[0];
          int maxsum=nums[0];
          int start=0,end=0,temp=0;
            for(int i=1;i<len;i++){
              if(nums[i]>currsum+nums[i]){
                  temp=i;
                  currsum=nums[i];
              }
              else currsum=currsum+nums[i];

              if(currsum>maxsum){
                start=temp;
                end=i;
                maxsum=currsum;
              }
            }  
        
        for (int i=start;i<=end;i++) {
          System.out.print(nums[i]+" ");
        }
    }
}
