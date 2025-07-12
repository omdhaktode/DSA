package DSA_1;
// addition of 2D matrix

import java.util.*;

public class Addition{
    
    public static void input(Scanner sc,int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public static int[][] addition(int[][] arr1,int[][] arr2){
        int row=arr1.length;
        int col=arr1[0].length;
        int[][] newarr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newarr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
    return newarr;
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
        System.out.print("Enter no of Rows of Matrix 1: ");
        int row1=sc.nextInt();
        System.out.print("Enter no of Columns of Matrix 1: ");
        int col1=sc.nextInt();
        System.out.println("Enter Elements of Matrix1: ");
        int arr1[][]=new int[row1][col1];
        input(sc,arr1, row1, col1);
        System.out.print("Enter no of Rows of Matrix 2: ");
        int row2=sc.nextInt();
        System.out.print("Enter no of Columns of Matrix 2: ");
        int col2=sc.nextInt();
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter Elements of Matrix2: ");
        input(sc,arr2, row2, col2);
        int[][] newarr=addition(arr1,arr2);
        System.out.println();
        System.out.println("Addition is: ");
        print(newarr);
        
    }
}