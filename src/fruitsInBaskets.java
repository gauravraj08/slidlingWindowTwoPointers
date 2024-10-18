import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class fruitsInBaskets {
    private static int total(int[] arr){
        int left=0,right=0,maxlen=0,n= arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while (map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;

    }
    private static int totalFruits(int[] arr){
        int n= arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            Set<Integer> s=new HashSet<>();
            for(int j=i;j<n;j++){
                s.add(arr[j]);
                if(s.size()<=2){
                    max=Math.max(max,j-i+1);
                }
                else break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={3, 1, 2, 2, 2, 2};
        System.out.println(total(arr));
    }
}
