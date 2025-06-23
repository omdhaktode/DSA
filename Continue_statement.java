import java.util.*;
public class Continue_statement {

    public static void break_used(Scanner sc){
      while(true){
         System.out.print("Enter a no: ");
         int no=sc.nextInt();
         if(no%10==0){
            System.out.println("Sorry Enter another no...");
            continue;
         }
         System.out.println("You entered: "+no);
      }
    }
    public static  void main(String[] args){
      Scanner sc=new Scanner(System.in);
      break_used(sc);
      sc.close();
    }
}

