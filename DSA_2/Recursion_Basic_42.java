package DSA_2;
import java.util.*;
public class Recursion_Basic_42 {

    public static void recursive(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        recursive(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=sc.nextInt();
        recursive(n);
        sc.close();
    }
}
