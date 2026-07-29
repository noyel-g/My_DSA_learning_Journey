import java.util.HashMap;

/**
 * LargestSubArray gives sum k using prefix sum + HashMap(if array having negetive numbers)
 */
public class LargestSubArray {
public static void main(String[] args) {
       int [] arr={1,1,1,2};
       System.out.println(longestSubarray(arr,2));
    }
    public static int longestSubarray(int[] arr, int num) {
		int len = arr.length;
		int max=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int [] prefix = new int[len];
		prefix[0] = arr[0];
		if (!map.containsKey(prefix[0]))
			map.put(prefix[0], 0);
		for (int i = 1; i<len; i++) {
			prefix[i] = prefix[i - 1]+arr[i];
			if (!map.containsKey(prefix[i]))
				map.put(prefix[i], i);
		}
		
		for (int i = 0; i<len; i++) {
			int sum = prefix[i];
			int needed = sum - num;
			if (map.containsKey(needed)) {
				int previous = map.get(needed);
			
			if (previous<i) {
				int currentlength = i - previous;
				if (currentlength>max)
					max = currentlength;
			}}
		}
		return max;
	}
    
}    
/*  in this we use prefix sum only (use if array only have positive numbers)
public int longestSubarray(int[] arr, int num) {
       int len=arr.length;
       int [] prefix  =new int[len];
        prefix[0]= arr[0];
        for(int i=1;i<len;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=len;i>0;i--){
            for(int j=0;j<len-i+1;j++){
                 int sum=0;
                 int end = j + i - 1;
                // for(int k=j;k<i+j;k++){
                     //sum=sum+arr[k];
                     if(j==0){
                        sum=prefix[end];
                    } else{ 
                    sum=prefix[end]-prefix[j-1];}
               //  }
                 if(sum==num){
                     return i;
                 }
            }
        }
        return 0;
    }

*/