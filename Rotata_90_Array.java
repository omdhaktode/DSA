// Rotate an array by 90 degrre -> 1.Transpose  2.Reverse
import java.util.*;
public class Rotata_90_Array {
    public static void input(Scanner sc,int[][] arr,int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public static void transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void reverse(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int left=0,right=arr[i].length-1;left<right;left++,right--){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
            }
        }
    }

    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no of cols: ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter array elements: ");
        input(sc,arr,rows,cols);
        System.out.println("Array after transpose: ");
        transpose(arr);
        print(arr);
        System.out.println("After reversing 90 degree: ");
        reverse(arr);
        print(arr);
        sc.close();
    }
}


