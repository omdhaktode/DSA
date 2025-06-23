// Given an ArrayList of integers, find and return the maximum value.

import java.util.ArrayList;
public class Max_List {

    public static void max(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }

        System.out.println("Maximum element is "+max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(22);
        list.add(34);
        list.add(2442);
        list.add(2);
        list.add(111);
        list.add(90);
        max(list);


    }
}
