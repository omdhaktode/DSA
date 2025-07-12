package DSA_2;
import java.util.*;
public class Recursion_Factorial_44 {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int result=n*fact(n-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println("Factorial of "+n+" is "+result );
        sc.close();
    }
}
