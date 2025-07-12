package DSA_2;
import java.util.*;
public class Prime_No_14 {

    public static boolean prime(int no){

    //prime no code 
        boolean b=true;
        for(int i=2;i<=Math.sqrt(no);i++){
            if(no%i==0){
                b=false;
                break;
            }
        }
    return b;
    }

    public static void check(int start,int end){
        for(int i=start;i<=end;i++){
            boolean b=prime(i);
            if(b){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a start: ");
        int start=sc.nextInt();
        System.out.println("Enter a end: ");
        int end=sc.nextInt();
        check(start, end);
        sc.close();
    }
}
