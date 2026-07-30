public class MajorityElement {
    
   public static void main(String[] args) {
       int [] arr={0,0,1,1,1};//array must have majority element else it will fail
      System.out.println(majorityElement(arr));      
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;

            if (num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
}
