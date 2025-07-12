package DSA_1;
// code for to return an array which consist smallest and greatest

import java.util.Arrays;

public class Gretaest_Smallest {
  
    public static int[] gretest_smallest(int[] arr){
        int newarr[]=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        newarr[0]=min;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        newarr[1]=max;
    return newarr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int newarr[]= gretest_smallest(arr);    
        System.out.println(Arrays.toString(newarr));
    }
}
