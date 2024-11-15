import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class diffUsingSorting {
    private static void diff(int[] arr,int n,int p){
        List<Integer> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        Arrays.sort(arr);

        for(int i=1;i<n;i++){
            res.add(Math.abs(arr[i-1]-arr[i]));
        }

//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                res.add(Math.abs(arr[i]-arr[j]));
//            }
//        }

        Collections.sort(res);

        for(int i=0;i<p;i++){
            ans.add(res.get(i));
        }

        for(int i:ans) System.out.println(i);
    }
    public static void main(String[] args) {
        int[] arr={3,5,9};
        diff(arr,3,2);
    }
}
