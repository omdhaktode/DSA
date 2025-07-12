package DSA_2;

import java.util.*;;
public class String_NoofChar_36 {

    public static int no_char(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }else{
                count++;
            }
        }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        int no=no_char(str);
        System.out.println("No of char present in string is "+no);
        sc.close();
    }
}
