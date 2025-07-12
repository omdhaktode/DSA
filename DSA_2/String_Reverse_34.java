package DSA_2;

import java.util.*;
public class String_Reverse_34 {

   /*  public static String ReverseString(String str){
        String arr[]=str.trim().split("\\s+");
        int start=0;
        int end=arr.length-1;
        while(start<end){
            String s=arr[start];
            arr[start]=arr[end];
            arr[end]=s;
            start++;
            end--;
        }
        StringBuilder newstr=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            newstr.append(arr[i]+" ");
        }
        str=newstr.toString().trim();
        return str;
    } */

    public static String ReverseString(String str){
        String arr[]=str.split("\\s+");
        StringBuilder newstr=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            newstr.append(arr[i]);
            newstr.append(" ");
        }
        return newstr.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        String rev=ReverseString(str);
        System.out.println("Reverse String: "+rev);
        sc.close();
    }
}
