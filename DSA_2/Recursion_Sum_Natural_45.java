package DSA_2;

import java.util.Scanner;

public class Recursion_Sum_Natural_45 {

    public static int sum(int n){
        int result=0;
        if(n==1){
            return n;
        }
        result=n+sum(n-1);
        return result;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int result=sum(n);
        System.out.println("Sum of first "+n+" is "+result );
        sc.close();
    }
}
