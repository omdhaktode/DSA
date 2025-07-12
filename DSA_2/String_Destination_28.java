package DSA_2;
import java.util.*;
public class String_Destination_28 {

    public static void path(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='E'){
                x++;
            }else if(str.charAt(i)=='S'){
                y--;
            }else {
                x--;
            }
        }
        x=x*x;
        y=y*y;
        float result=(float)(Math.sqrt((x+y)));
        System.out.println("Shortest Distance is "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Path: ");
        String str=sc.next();
        str=str.toUpperCase();
        path(str);
        sc.close();
    }
}
