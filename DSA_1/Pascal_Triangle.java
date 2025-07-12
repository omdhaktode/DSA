package DSA_1;
// print pascal triangle in that dynamic array is present known as jagged array

import java.util.*;
public class Pascal_Triangle {

    public static int[][] pascal(int row){
        int[][] arr=new int[row][];
        for(int i=0;i<row;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
    return arr;

    }
    public static void print(int arr[][]){
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
        int row=sc.nextInt();
        int newarr[][]=pascal(row);
        print(newarr);
        sc.close();
    }
}
