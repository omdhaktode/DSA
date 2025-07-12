package DSA_2;

import java.util.*;
public class Area_Circle_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double PI=Math.PI;
        System.out.print("Enter radius of circle: ");
        int radius=sc.nextInt();
        double result=PI*(radius*radius);
        System.out.println("Area of circle is "+result);
        sc.close();
    }
}
