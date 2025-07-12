package DSA_2;

import java.util.*;
public class String_First_Occu_33 {

    public static int FirstOccurance(String A,String B){
        A=A.toLowerCase();
        B=B.toLowerCase();
        for(int i=0;i<A.length()-B.length()+1;i++){
            if(A.charAt(i)==B.charAt(0)){
                if(A.substring(i,i+B.length()).equals(B)){
                    return i;
                }
            }
        }
  return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String1: ");
        String A=sc.nextLine();
        System.out.print("Enter a String2: ");
        String B=sc.nextLine();
        int n=FirstOccurance(A,B);
        System.out.println("First occurance of word is "+n);
        sc.close();
    }
}
    
