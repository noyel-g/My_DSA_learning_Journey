public class CheckIfTheArrayIsSorted {
    public static void main(String[] args) {
       int [] arr={10,11,1,2,3,4,5};
       System.out.println(check(arr));
       
    }
    public static boolean check(int[] nums) {
      int len=nums.length;
      boolean result=true;
      int  i=0;
      int j=1;
      while(j<len&&nums[i]<=nums[j]){
        i++; j++;
      }
      if(j==len) return true;
      while(j<len-1){
        if((nums[j]<=nums[j+1])){
            j++;
        } else return false;
      }
      if(j<len-1) result= false;
      
      if(nums[0]<nums[len-1]){
        result=false;
      }
      return result;
    }
}
