// code to find a key last occurance position

import java.util.*;
public class Last_occurance {

    public static int lastocc(int arr[],int key){

        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                last=i;
            }
        }
    return last;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int no=sc.nextInt();
        System.out.print("Enter "+no+" elements: ");
        int[] arr=new int[no];
        for(int i=0;i<no;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Key: ");
        int key=sc.nextInt();
        int result=lastocc(arr, key);
        System.out.print("Last occurance of an "+key+" is "+result );
        sc.close();

    }
}
