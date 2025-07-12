package DSA_2;

import java.util.*;
public class String_Word_Pattern_41 {

    public static boolean check(String pattern,String str){
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        if(arr.length != pattern.length()){
            return false;
        }
        HashMap<Character,String> h=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            boolean b=h.containsKey(c);
            if(h.containsValue(arr[i]) && !b){
                return false;
            }
            if(b && !h.get(c).equals(arr[i])){
                return false;
            }
            else{
                h.put(c,arr[i]);
            }
        }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Pattern: ");
        String pattern=sc.nextLine();
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        boolean b=check(pattern,str);
        System.out.println(b);
        sc.close();
    }
}
