// code for to entered a multiple of 10 then break statement executed 
import java.util.*;
public class Break_Statement {

    public static void break_used(Scanner sc){
      while(true){
         System.out.print("Enter a no: ");
         int no=sc.nextInt();
         if(no%10==0){
            System.out.println("You entered multiple of 10");
            break;
         }
      }
      System.out.println("Thank you for using my code");
    }
    public static  void main(String[] args){
      Scanner sc=new Scanner(System.in);
      break_used(sc);
      sc.close();
    }
}
