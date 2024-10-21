public class longestRepeatingChar {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0,maxLen=0,maxF=0;
        int[] freq=new int[26];
        for(int r=0;r<n;r++){
            freq[s.charAt(r)-'A']++;
            maxF=Math.max(maxF,freq[s.charAt(r)-'A']);

            if(r-l+1-maxF>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }

            maxLen=Math.max(maxLen,r-l+1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        longestRepeatingChar lrc=new longestRepeatingChar();
        System.out.println(lrc.characterReplacement("AABABBA",1));
    }
}
