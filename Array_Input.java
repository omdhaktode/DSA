import java.util.*;
public class Array_Input {

    public static void printnew(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println();
        System.out.println("You are element is: ");
        printnew(arr);
        
        System.out.println();
        System.out.println("New Array elements are: ");
       
        int[] newarr=arr;
        printnew(newarr);
        sc.close();
    }
}
