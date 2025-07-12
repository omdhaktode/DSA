package DSA_1;
// code for Reverse a No
import java.util.*;
public class Reverse_No {
    
    public static void logic1(int no){
        while(no>0){
            int temp=no%10;
            System.out.print(temp);
            no=no/10;
        }
        System.out.println();
    }

    public static void logic2(int no){
        int reverse=0;
        while(no>0){
            int temp=no%10;
            reverse=(reverse*10)+temp;
            no=no/10;
        }
        System.out.println("Reverse no is: "+reverse);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int no=sc.nextInt();
        logic1(no);
        logic2(no);
        sc.close();
    }
}
