package DSA_1;
// code for check even or odd

import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to check even of odd: ");
        int no=sc.nextInt();
        if(no%2==0){
            System.out.println("Even no: "+no);
        }else{
            System.out.println("Odd no: "+no);
        }
        sc.close();
    }
}

