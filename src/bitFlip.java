public class bitFlip {
    public static int minKBitFlips(int[] nums, int k) {
        int n = nums.length, flipped = 0, res = 0;
        int[] isFlipped = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            if (i >= k)
                flipped ^= isFlipped[i - k];
            if (flipped == nums[i]) {
                if (i + k > nums.length)
                    return -1;
                isFlipped[i] = 1;
                flipped ^= 1;
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0};
        int ans=minKBitFlips(arr,1);
        System.out.println(ans);
        System.out.println('-' - '0');
    }
}
