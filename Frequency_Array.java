// calculate freq of an array and used them for searching elements
import java.util.*;
public class Frequency_Array {

    public static int[] freq(int[] arr){
        int newarr[]=new int[10000];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }
    return newarr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={33,2,211,34,5,11,32,111,234,10};
        int[] freqArr=freq(arr);
        System.out.print("Enter no of queries: ");
        int q=sc.nextInt();
        while(q>0){
            System.out.print("Enter a no: ");
            int no=sc.nextInt();
            if(freqArr[no]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
