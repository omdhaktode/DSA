package DSA_1;
// based of subarray

import java.util.ArrayList;
import java.util.List;

public class TCS2 {

    public static List<Integer> subofmax(int arr[],int key){
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<arr.length-key+1;i++){
            int max=arr[i];
            for(int j=i;j<i+key;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            ans.add(max);
        }
    return ans;

    }
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<Integer>();
        int arr[]={1,3,-1,-3,5,3,6,7};
        int key=3;
        ans=subofmax(arr,key);
        System.err.println(ans);
    }
}
