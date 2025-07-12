package DSA_2;

import java.util.*;

public class Reverse_Array_19 {
   //using for loop
    /* public static int[] reverse(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            n--;
        }
    return arr; 
    }*/
   //two pointer approch
    /* public static int[] reverse(int[] arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    return  arr;
    } */

    // using whileloop
    public static int[] reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    return arr;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int no=sc.nextInt();
        int arr[]=new int[no];
        System.out.println("Enter "+no+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int newarr[]=reverse(arr);
        System.out.println(Arrays.toString(newarr));
        sc.close();
    }
    }

