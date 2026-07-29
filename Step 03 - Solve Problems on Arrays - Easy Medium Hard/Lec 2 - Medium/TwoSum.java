import java.util.HashMap;

public class TwoSum {
    
    public static void main(String[] args) {
       int [] arr={10,8,7,6,5,4,11,2,1};
      for (int i : twoSum(arr,21)) {
        System.out.print(i+ " ");
      }      
    }
    public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
        int complement=target-nums[i];
        if(map.containsKey(complement)) return new int[]{map.get(complement),i}; 
        map.put(nums[i],i);
        }
        return new int[] {};
    }
}

