package DSA_1;
// code for find factorial of no
import java.math.BigInteger;
import java.util.*;
public class Factorial_No {

    public static void fact(int no){
        BigInteger factorial=BigInteger.ONE;
        if(no==0 || no==1){
            System.out.print("Factorial of "+no+" is "+factorial);
        }else{
            for(int i=1;i<=no;i++){
                factorial=factorial.multiply(BigInteger.valueOf(i));
            }
        System.out.println("Factorial of "+no+" is "+factorial);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int no=sc.nextInt();
        fact(no);
        sc.close();
    }
}
