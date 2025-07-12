package DSA_2;
import java.util.*;
public class Largest_Array_17 {

    public static void max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    System.out.println("Max of array is "+max);
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
        max(arr);
        sc.close();
    }
}
