package DSA_1;
import java.util.*;
public class Reverse_ArrayList_II {

    public static void reverse(ArrayList<Integer> list){
        int start=0;
        int end=list.size()-1;

        while(start<end){
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }

        for(int ele:list){
            System.out.print(ele+" ");

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    
        reverse(list);
        
    }
}
