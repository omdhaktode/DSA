package DSA_1;
// calculate an array who holds suffix sum

import java.util.Arrays;

public class Suffix_Sum {

    public static int[] suffix(int[] arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]+=arr[i+1];
        }
    return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,1,3};
        arr=suffix(arr);
        System.out.println(Arrays.toString(arr));
    }
}
