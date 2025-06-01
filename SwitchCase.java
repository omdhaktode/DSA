// demonstarte use of switch case in java

import java.util.*;

public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    switch(a){
        case "a":
                System.out.println("Apple");
                break;
        case "b":
                System.out.println("Banana");
                break;
        case "c":
                System.out.println("Mango");
                break;
        default:
                System.out.println("Invalid Input");
    }
    sc.close();
  }    
}
