package DSA_2;

import java.util.Arrays;

public class Problem_25 {

    // 
    
    public static boolean check(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(check(arr));
    }
}
