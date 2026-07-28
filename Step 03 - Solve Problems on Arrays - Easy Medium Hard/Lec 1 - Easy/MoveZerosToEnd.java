/**
 * MoveZerosToEnd
 */
public class MoveZerosToEnd {
     public static void main(String[] args) {
       int [] arr={10,0,8,7,0,5,4,3,2,1};
       moveZeroes(arr);
       for (int i : arr) {
        System.out.print(i+ " ");
       }
       
    }
     public static void moveZeroes(int[] nums) {
        int len=nums.length;
        int i=0;
        for(int j=0;j<len;j++){
            if(nums[j]!=0&&i!=0){
                nums[j-i]=nums[j];
            } else if(nums[j]==0){
                i++;
            }
            }
        
        for(int j=0;j<i;j++){
            nums[len-1]=0;
            len--;
        }
        }
}