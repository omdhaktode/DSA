package DSA_1;
// code for prime no 
import java.util.*;
public class Prime_No{

    public static boolean prime(int no){
        if(no==1){
           return false;
        }else if(no==2){
           return true;
        }else {
            for(int i=2;i<no;i++){
                if(no%i==0){
                    return false;
                }
            }
        return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int no=sc.nextInt();
        boolean a=prime(no);
        System.out.println(a);
        sc.close();
    }
}