package DSA_1;
// Transpose an array or like rotation of an array
import java.util.*;
public class Transpose_Array {

    public static void input(Scanner sc,int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    // using new array
    public static int[][] transpose1(int arr[][],int row,int col){
        int newarr[][]=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                newarr[i][j]=arr[j][i];
            }
        }
    return newarr;
    }

    // using same array
    public static int[][] transpose2(int arr[][],int row,int col){
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    return arr;
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
        System.out.print("Enter rows: ");
        int row=sc.nextInt();
        System.out.print("Enter cols: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        input(sc,arr,row,col);
        System.out.println();
        System.out.println("After transpose an array: ");
        int newarr1[][]=transpose1(arr, row, col);
        int newarr2[][]=transpose2(arr, row, col);
        System.out.println("Using new array method: ");
        print(newarr1);
        System.out.println("Using same array by swapping: ");
        print(newarr2);
        sc.close();
    }
}
