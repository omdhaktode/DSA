package DSA_2;
import java.util.*;
public class String_Length_32 {

    public static int LastWordLength(String str){
        int count=0;
        str=str.strip();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
        count++;
        }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        int n=LastWordLength(s);
        System.out.println("Length of last word is "+n);
        sc.close();
    }
}
