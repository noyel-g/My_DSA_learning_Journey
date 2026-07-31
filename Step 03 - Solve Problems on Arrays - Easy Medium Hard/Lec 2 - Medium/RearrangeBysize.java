/**
 * RearrangeBysize
 */
public class RearrangeBysize {
    public static void main(String[] args) {
       int [] arr={-1,-1,1,0};
      for (int i : rearrangeArray(arr)) {
        System.out.print(i+" ");
      }    
    }
    public static int[] rearrangeArray(int[] nums) {
       int [] arr=new int[nums.length];
       int pos=0;
       int neg=1;
       for(int num: nums){
        if(num>0){  arr[pos]=num; pos=pos+2;}
        if(num<0){ arr[neg]=num; neg=neg+2;}
        }
        return arr;
    }
}