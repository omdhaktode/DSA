package DSA_2;

import java.util.*;
public class ArrayList_Max_52 {
    //maximum from an array
    public static int Max(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            /* if(list.get(i)>max){
                max=list.get(i);
            } */
            max=Math.max(list.get(i),max);
        }
    return max;
    }

    // Swap two elements
    public static void swap(ArrayList<Integer> list,int i1, int i2){
        int temp=list.get(i1);
        list.set(i1,list.get(i2));
        list.set(i2,temp);
        System.out.println("Swapped List: "+list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(17);
        list.add(66);
        list.add(11);
        list.add(67);
        list.add(99);
        int i1=2;
        int i2=4;
        int max=Max(list);
        System.out.println("Original List: "+list);
        swap(list, i1, i2);
        System.out.println(max);
    }
}
