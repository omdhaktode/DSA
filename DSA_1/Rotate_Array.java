package DSA_1;
// Rotate an array by Kth element

import java.util.Arrays;

public class Rotate_Array {

   /*  public static int[] rotate(int[] arr,int K){
        int len=arr.length;
        int newArr[]=new int[len];
        int j=0;
        K=K%len;

        for(int i=len-K;i<len;i++){
            newArr[j++]=arr[i];
        }

        for(int i=0;i<len-K;i++){
            newArr[j++]=arr[i];
        }

    return newArr;
    } */

    public static int[] reverse(int arr[],int start,int end){ 
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    return arr;
    }

    public static int[] rotate(int[] arr,int K){
        
        int len=arr.length;
        K=K%len;
        reverse(arr, 0,len-K-1);
        reverse(arr, len-K, len-1);
        reverse(arr, 0,len-1);
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int Kth=1;
        int[] newarr=rotate(arr, Kth);
        System.out.println(Arrays.toString(newarr));

    }
}
