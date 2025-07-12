package DSA_2;

import java.util.*;
public class String_Annagrams_38 {

    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
            return true;
        }
    return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str1=sc.nextLine();
        System.out.print("Enter String2: ");
        String str2=sc.nextLine();
        System.out.println(anagram(str1, str2));
        sc.close();
    }
}
