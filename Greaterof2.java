// code for greater of 2 data

import java.util.*;
public class Greaterof2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A: ");
        int a=sc.nextInt();
        System.out.print("Enter B: ");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A is equal to B");
        }else if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }
        sc.close();
    }
}
