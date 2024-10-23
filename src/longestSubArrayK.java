import java.util.HashMap;

public class longestSubArrayK {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        int sum=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K) max=Math.max(max,i+1);
            int rem=sum-K;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                max=Math.max(max,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        System.out.println(lenOfLongSubarr(arr,arr.length,3));
    }
}
