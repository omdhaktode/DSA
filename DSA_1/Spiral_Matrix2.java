package DSA_1;
// Generate spiral matrix using n to n^2

/* 
ex: n=3; n^2=9
output: 

1 2 3
8 9 4
7 6 5 */
import java.util.*;
public class Spiral_Matrix2 {

    public static int[][] spiral(int n){
        int arr[][]=new int[n][n];
        int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
        int curr=1;
        while(curr<=n*n){
            for(int j=leftcol;j<=rightcol && curr<=n*n;j++){
                arr[toprow][j]=curr++;
            }
            toprow++;

            for(int i=toprow;i<=bottomrow && curr<=n*n;i++){
                arr[i][rightcol]=curr++;
            }
            rightcol--;

            for(int j=rightcol;j>=leftcol && curr<=n*n;j--){
                arr[bottomrow][j]=curr++;
            }
            bottomrow--;

            for(int i=bottomrow;i>=toprow && curr<=n*n;i--){
                arr[i][leftcol]=curr++;
            }
            leftcol++;
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
        System.out.print("Enter a no: ");
        int n=sc.nextInt();
        int arr[][]=spiral(n);
        print(arr);
        sc.close();
    }
}
