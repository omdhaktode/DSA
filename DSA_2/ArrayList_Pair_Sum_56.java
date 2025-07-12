package DSA_2;
import java.util.*;
public class ArrayList_Pair_Sum_56 {
    
    /* Brute Force Approch TC-> O(n^2)
    public static ArrayList<Integer> print(ArrayList<Integer> l,int key){
        ArrayList<Integer> a=new ArrayList<>(2);
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
                if((l.get(i)+l.get(j))==key){
                    a.add(0,i);
                    a.add(1,j);
                    return a;
                }
            }
        }
        a.add(-1);
        return  a;
    }  */

    //Two Pointor approch TC-> O(n)
    public static ArrayList<Integer> print(ArrayList<Integer> l,int key){
        ArrayList<Integer> a=new ArrayList<>(2);
        int start=0,end=l.size()-1;
        while(start<end){
            if((l.get(start)+l.get(end))==key){
                a.add(0,start);
                a.add(1,end);
                return a;
            }else if((l.get(start)+l.get(end))<key){
                start++;
            }
            else{
                end--;
            }
        }
        a.add(-1);
        return a;
    }     
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        ArrayList<Integer> a=print(l, 5);
        System.out.println(a);
    }
}
