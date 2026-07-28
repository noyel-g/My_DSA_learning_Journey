import java.util.ArrayList;

public class FindTheUnion {
  public static void main(String[] args) {
       int [] a={1,1,2,3,4,5};
       int [] b={2,5,9};
       ;
      for (int i :findUnion(a,b) ) {
        System.out.print(i+ " ");
      }
       
    }



    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       ArrayList<Integer> list =new ArrayList<>();
        int len0=removeDuplicates(a);
        int len1=removeDuplicates(b);
        int l0=0,l1=0;
        while(l0<len0&&l1<len1){
        if(a[l0]<b[l1]){
            list.add(a[l0]);
            l0++;
        } else if(a[l0]>b[l1]){
            list.add(b[l1]);
            l1++;
        } else {
            list.add(a[l0]);
            l0++;l1++;
        }
    }
    while(l0<len0){
       list.add(a[l0]);
       l0++;
    }
     while(l1<len1){
        list.add(b[l1]);
        l1++;
    }
    return list;
    }
    
    private static int removeDuplicates(int [] nums){
        if(nums.length==0) return 0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
