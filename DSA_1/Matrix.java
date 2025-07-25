package DSA_1;
import java.util.Arrays;

public class Matrix {

    public static void swap(int arr[][]){
           for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
           }

           for(int j=0;j<arr.length;j++){
            for(int i=0,rev=arr.length-1;i<rev;i++,rev--){
                int temp=arr[i][j];
                arr[i][j]=arr[rev][j];
                arr[rev][j]=temp;
            }
           }

           for(int []row: arr){
               System.out.println(Arrays.toString(row));
           }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        swap(arr);
    }
}
