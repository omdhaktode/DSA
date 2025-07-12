package DSA_2;
import java.util.*;

public class String_First_NonReapting_Char_39 {

    public static void First_Repeat(String str){
        int[] freq=new int[26];
        char c='a';
        for(int i=0;i<str.length();i++){
            int j=str.charAt(i)-c;
            freq[j]++;
        }
        for(int i=0;i<str.length();i++){
            int j=str.charAt(i)-c;
            if(freq[j]==1){
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        First_Repeat(str);
        sc.close();
    }
}
