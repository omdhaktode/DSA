package DSA_2;

import java.util.*;
public class ArrayList_Multidimensional_54 {

    public static void calculate(ArrayList<Integer> list,int no){
        int i=1;
        int count=5;
        while(i<=count){
            list.add((i*no));
            i++;
        }
        System.out.println(list);
    }

    public static void print(ArrayList<ArrayList<Integer>> list){
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> l=list.get(i);
            for(int j=0;j<l.size();j++){
                System.out.print(l.get(j)+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>(5);
        ArrayList<Integer> l2=new ArrayList<>(5);
        ArrayList<Integer> l3=new ArrayList<>(5);
        calculate(l1, 2);
        calculate(l2, 3);
        calculate(l3, 4);
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println(list);
        print(list);

    }
}
