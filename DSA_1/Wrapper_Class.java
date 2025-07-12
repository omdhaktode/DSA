package DSA_1;
import java.util.ArrayList;
public class Wrapper_Class {
  public static void main(String[] args) {
    
    //  Integer i=new Integer(3); 
    //  System.err.println(i);

    // Integer a=Integer.valueOf(5);
    // System.out.println(a);

    //  ArrayList<Integer> list=new ArrayList<>();
    //  list.add(1);
    //  list.add(2);
    //  list.add(3);
    //  list.add(4);
    //  list.add(5);
    // //  System.out.println(list);

    // System.out.println(list.contains(Integer.valueOf(2)));


    ArrayList<Object> list=new ArrayList<>();
    list.add("Akash");
    list.add(3);
    list.add("Rahul");
    list.add(21);
    System.out.println(list);

    int b=list.indexOf(3);
    System.out.println(b);




    
    
  }   
}
