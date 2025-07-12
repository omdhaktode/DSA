package DSA_1;

import java.util.*;
public class Binary_Search {

    public static int Binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int a=Binary(arr,key);
        System.out.println("Index is "+a);
        sc.close();
    }
}
