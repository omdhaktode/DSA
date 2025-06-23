// prefix sum concept implementation

import java.util.Arrays;

public class Prefix_Sum {

  /*   public static int[] prefix(int[] arr){
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                newarr[i]+=arr[j];
            }
        }
    return newarr;
    } */

    public static int[] prefix(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        int newarr[]=prefix(arr);
        System.out.println(Arrays.toString(newarr));
    }
}
