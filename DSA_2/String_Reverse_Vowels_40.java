package DSA_2;

import java.util.*;
public class String_Reverse_Vowels_40 {

    public static boolean isVowel(char c){
        if(c== 'a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            return true;
        }
    return false;
    }

    public static void reverse(String str){
        int start=0,end=str.length()-1;
        char c[]=str.toCharArray();
        while(start<end){
            if(isVowel(c[start])){
                 if(isVowel(c[end])){
                    char temp=c[start];
                    c[start]=c[end];
                    c[end]=temp;
                    start++;
                    end--;
                 }else{
                    end--;
                 }
            }
            else{
                start++;
            }
         }
         System.out.println(String.valueOf(c));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        reverse(str);
        sc.close();
    }
}
