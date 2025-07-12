package DSA_1;
// find index where element is present using linear search
import java.util.*;
public class Linear_Search {

    public static int linear(int arr[],int key){
         for(int i=0;i<arr.length;i++){
              if(arr[i]==key){
                return i;
              }
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Key: ");
        int key=sc.nextInt();
        int a=linear(arr, key);
        if(a==-1){
            System.out.println("Key not found");
        }else{
            System.out.println(key+" key found at "+a+" location");
        }
        sc.close();
    }   
}

