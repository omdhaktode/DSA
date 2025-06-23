// Find left to right position sum using prefix sum concepet
import java.util.*;
public class Prefix_Sum_L_R {

    public static int[] prefix(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of queries: ");
        int q=sc.nextInt(); 
        arr=prefix(arr);
        while(q>0){
            System.out.print("Enter Left Position: ");
            int left=sc.nextInt();
            System.out.print("Enter Right Position: ");
            int right=sc.nextInt();
            int result=arr[right]-arr[left-1];
            System.out.println("The Addition is from "+left+" to "+right+" position is "+result);
            q--;
        }
        sc.close();
    }

}
