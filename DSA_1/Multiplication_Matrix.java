package DSA_1;
// Multiplication of matrix
import java.util.*;
public class Multiplication_Matrix {

    public static int[][] mul(int[][] arr1,int row1,int col1,int[][] arr2,int row2,int col2){
        if(col1 != row1){
            System.out.println("You eneterd wrong dimensions");
            // return;
        }
        int result[][]=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    result[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }
    return result;
    }

    public static void input(Scanner sc,int arr[][],int row,int col){
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
        System.out.print("Enter no of rows1: ");
        int row1=sc.nextInt();
        System.out.print("Enter no of col1: ");
        int col1=sc.nextInt();
        int arr1[][]=new int[row1][col1];
        System.out.println("Enter elements: ");
        input(sc, arr1, row1, col1);
        System.out.print("Enter no of rows2: ");
        int row2=sc.nextInt();
        System.out.print("Enter no of col2: ");
        int col2=sc.nextInt();
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter elements: ");
        input(sc, arr2, row2, col2);
        int newarr[][]=mul(arr1, row1, col1, arr2, row2, col2);
        System.out.println("Multiplication of Matrix is: ");
        print(newarr);
        sc.close();
    }
}
