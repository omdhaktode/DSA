package DSA_2;

import java.util.*;
public class Binary_Decimal_15 {

    public static void dec(int no){
        int result=0;
        int p=0;
        while(no>0){
            int temp=no%10;
            result=result+(temp*((int)Math.pow(2, p)));
            p++;
            no=no/10;
        }
    System.out.println("Decimal is "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No: ");
        int n=sc.nextInt();
        dec(n);
        sc.close();
    }
}
