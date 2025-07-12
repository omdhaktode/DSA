package DSA_2;

import java.util.Scanner;

public class Binary_Search_18 {

    public static int binary(int[] arr,int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter a key: ");
        int key=sc.nextInt();
        System.out.println(binary(arr, key));
        sc.close();
    }
}
