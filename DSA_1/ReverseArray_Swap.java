package DSA_1;
// reverse an array using 2 approch

import java.util.Arrays;

public class ReverseArray_Swap {

    // approch1 by creating new array
    // public static int[] reverse(int[] arr){
    //     int newarr[]=new int[arr.length];
    //     int i=0;
    //     for(int j=arr.length-1;j>=0;j--){
    //         newarr[i++]=arr[j];
    //     }
    // return newarr;
    // }

    public static int[] reverse(int[] arr){
        int len=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[len];
            arr[len]=temp;
            len--;
        }
    return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        arr=reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
