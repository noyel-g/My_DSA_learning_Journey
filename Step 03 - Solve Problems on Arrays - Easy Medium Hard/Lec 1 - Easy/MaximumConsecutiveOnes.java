public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
       int [] arr={0,1,1};
       int n=findMaxConsecutiveOnes(arr);
       System.out.println(n);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;int count=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
            if(max<count)
             max=count;
             count=0;
          }
          if(nums[i]==1){
            count++;
          }
        }
        if(max>count) return  max ;
        else return count;
    }
}
