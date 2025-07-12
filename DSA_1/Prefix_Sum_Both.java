package DSA_1;
// Sum of matrix by dimensions using Prefix sum over rows and columns both

import java.util.*;
public class Prefix_Sum_Both {

    public static void input(Scanner sc,int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
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

    public static int[][] changeinprefix(int arr[][],int row,int col){
        for(int i=0;i<row;i++){
            for(int j=1;j<col;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }

        for(int i=0;i<col;i++){
            for(int j=1;j<row;j++){
                arr[j][i]+=arr[j-1][i];
            }
        }
    return arr;
    }

    public static int sum(int arr[][],int row,int col,int row1,int row2,int col1,int col2){
        changeinprefix(arr, row, col);
        int ans=0,sum=0,up=0,side=0,uplevel=0;
        sum=arr[row2][col2];
        up=arr[row1-1][col2];
        side=arr[row2][col1-1];
        uplevel=arr[row1-1][col1-1];

        ans+=sum-up-side+uplevel;

        return ans;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter no of cols: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter matrix elements: ");
        input(sc,arr,row,col);
        System.out.println("Array Elements are: ");
        print(arr);
        System.out.print("Enter dimension row1:");
        int row1=sc.nextInt();
        System.out.print("Enter dimension row2:");
        int row2=sc.nextInt();
        System.out.print("Enter dimension col1:");
        int col1=sc.nextInt();
        System.out.print("Enter dimension col2:");
        int col2=sc.nextInt();
        sum(arr, row,col,row1, row2, col1, col2);
        sc.close();
    }
}
