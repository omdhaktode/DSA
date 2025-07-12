package DSA_1;
import java.util.*;
public class Sum_Matrix {
    public static void input(Scanner sc,int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static int addition(int[][] arr,int row1,int row2,int col1,int col2){
        int sum=0;
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                sum+=arr[i][j];
            }
        }
    return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][4];
        System.out.println("Enter 16 elements: ");
        input(sc,arr);
        System.out.println("Enter row1:");
        int row1=sc.nextInt();
        System.out.println("Enter row2:");
        int row2=sc.nextInt();
        System.out.println("Enter col1:");
        int col1=sc.nextInt();
        System.out.println("Enter col2:");
        int col2=sc.nextInt();
        int ans=addition(arr,row1,row2,col1,col2);
        System.out.println("Answer is "+ans);
        sc.close();
        
    }
}
