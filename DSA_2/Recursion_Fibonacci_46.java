package DSA_2;

import java.util.Scanner;

public class Recursion_Fibonacci_46 {

    public static int fib(int n){
        
        if(n==0 || n==1){
            return n;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int result=fib1+fib2;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int result=fib(n);
        System.out.println("Fibonacci of "+n+"th term is "+result );
        sc.close();
    }
}
