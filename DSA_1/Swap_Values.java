package DSA_1;
// swapping values of two variables

public class Swap_Values{

    public static void swap(int a,int b){
        
        // using extra variable we swap the value        
        //  int temp=a;
        //  a=b;
        //  b=temp; 
        //  System.out.println("a:"+a);
        //  System.out.println("b:"+b);

        // using sum and differnce method

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
       int a=20;
       int b=30;
       swap(a, b); 
    }
}