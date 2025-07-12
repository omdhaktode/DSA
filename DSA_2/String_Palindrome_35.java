package DSA_2;
import java.util.*;
public class String_Palindrome_35 {

    public static boolean palindrome(String str){
        str=str.toLowerCase();
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        boolean b=palindrome(str);
        if(b){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
        sc.close();
    }
}
