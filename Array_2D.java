// learn 2d arrays

import java.util.*;
public class Array_2D {

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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int r=sc.nextInt();
        System.out.print("Enter no of Columns: ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        input(sc, arr,r,c);
        System.out.println();
        System.out.println("Elements are: ");
        print(arr);
        sc.close();
    }
}
