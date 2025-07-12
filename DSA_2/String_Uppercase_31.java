package DSA_2;
import java.util.*;
public class String_Uppercase_31 {

    public static String upper(String str){
        StringBuilder newstr=new StringBuilder();
        char c=Character.toUpperCase(str.charAt(0));
        newstr.append(c);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                newstr.append(str.charAt(i));
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));
            }else{
                newstr.append(str.charAt(i));
            }
        }
    return newstr.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        System.out.println(upper(str));
        sc.close();
    }
}
