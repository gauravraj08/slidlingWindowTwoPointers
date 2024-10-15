public class niceSubarray {
    public static int numberOfSubarrays(int[] nums, int k) {
        int n= nums.length;
        int [] count = new int [n+1];
        count[0]=1;
        int res=0,oddcount=0;
        for(int num:nums){
            oddcount+= num & 1;
            if(oddcount- k>= 0){
                res+= count[oddcount -k];
            }
            count[oddcount]++;
        }
        return res;
    }
//    public static int numberOfSubarrays(int[] nums, int k) {
//        return findTotalSubarray(nums,k)-findTotalSubarray(nums,k-1);
//    }
//
//    private static int findTotalSubarray(int[] nums,int k){
//        for(int i=0;i<nums.length;i++){
//            nums[i]%=2;
//        }
//        int i=0,j=0,subarray=0,countOdd=0;
//
//        while(j<nums.length){
//            if(nums[i]==1) countOdd++;
//
//            while(countOdd>k){
//                if(nums[i]==1) countOdd--;
//                i++;
//            }
//            subarray += j-i+1;
//            j++;
//        }
//        return subarray;
//    }

    public static void main(String[] args) {
        int[] arr={1,1,2,1,1};
        int ans=numberOfSubarrays(arr,3);
        System.out.println(ans);
    }
}
