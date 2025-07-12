package DSA_2;

import java.util.*;
public class Linear_Search_16 {
    
    public static int linear(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter a key: ");
        int key=sc.nextInt();
        System.out.println(linear(arr, key));
        sc.close();
    }
}
