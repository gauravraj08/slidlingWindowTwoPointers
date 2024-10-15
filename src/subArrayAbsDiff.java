import java.util.TreeMap;

public class subArrayAbsDiff {
    public static int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int i=0,j=0,max=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.lastKey() - map.firstKey() > limit){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;


    }
    public static void main(String[] args) {
     int[] arr= {8,2,4,7};
     int ans=longestSubarray(arr,4);
     System.out.println(ans);
    }
}
