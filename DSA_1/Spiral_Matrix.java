package DSA_1;
// Spiral Matrix 
/* 
1 2 3
4 5 6 
7 8 9 
output: 1 2 3 6 9 8 7 4 5*/
import java.util.*;
public class Spiral_Matrix{

    public static void input(Scanner sc,int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public static void spiral(int arr[][],int rows,int cols){
        int toprow=0;
        int bottomrow=rows-1;
        int leftcol=0;
        int rightcol=cols-1;
        int totalelements=0;
        while(totalelements<rows*cols){
            for(int i=leftcol;i<=rightcol && totalelements<rows*cols;i++){
                System.out.print(arr[toprow][i]+" ");
                totalelements++;
            }
            toprow++;
            for(int j=toprow;j<=bottomrow && totalelements<rows*cols;j++){
                System.out.print(arr[j][rightcol]+" ");
                totalelements++;
            }
            rightcol--;
            for(int i=rightcol;i>=leftcol && totalelements<rows*cols;i--){
                System.out.print(arr[bottomrow][i]+" ");
                totalelements++;
            }
            bottomrow--;
            for(int j=bottomrow;j>=toprow && totalelements<rows*cols;j--){
                System.out.print(arr[j][leftcol]+" ");
                totalelements++;
            }
            leftcol++;
        }
    }

    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no of cols: ");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        input(sc,arr);
        System.out.println("Input Matrix is: ");
        print(arr);
        System.out.println("After Spiral form: ");
        spiral(arr,rows,cols);
        sc.close();
    }
}