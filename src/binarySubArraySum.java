
public class binarySubArraySum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return findTotalSubarray(nums,goal)-findTotalSubarray(nums,goal-1);
    }
    private static int findTotalSubarray(int[] nums,int k){
        if(k < 0) return 0;
        int left=0,right=0,sum=0,count=0;

        while(right<nums.length){
            sum+=nums[right];

            while(sum>k){
                sum=sum-nums[left];
                left++;
            }
            count += right-left+1;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        binarySubArraySum bs=new binarySubArraySum();
        int[] arr={1,0,1,0,1};
        System.out.println(bs.numSubarraysWithSum(arr,2));
    }
}
