package DSA_1;
// count sum of 1st n natural nos
import java.util.*;
public class Sumof1stN_nos {
    
  public static int count(int no){
    int sum=0;
    for(int i=1;i<=no;i++){
        sum+=i;
    }
    return sum;
}
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a No: ");
         int no=sc.nextInt();
         System.out.println(count(no));
         sc.close();
    }
}

