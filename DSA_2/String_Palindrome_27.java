package DSA_2;
import java.util.*;;
public class String_Palindrome_27 {

    public static boolean check(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any word: ");
        String str=sc.nextLine();
        boolean b=check(str);
        System.out.println(b);
        sc.close();
    }
}
