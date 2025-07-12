package DSA_2;

import java.util.*;
public class String_SubString_37 {

    public static int substring(String str){
        int start=0,end=0;
        Set<Character> li = new HashSet<>();
        int maxlength=0;
        while(end<str.length()){
            if(!li.contains(str.charAt(end))){
                li.add(str.charAt(end));
                end++;
                maxlength=Math.max(maxlength,li.size());
            }else{
                li.remove(str.charAt(start));
                start++;
            }
        }
    return maxlength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        int result=substring(str);
        System.out.println("Mamimux length of substring is "+result);
        sc.close();
    }
}
