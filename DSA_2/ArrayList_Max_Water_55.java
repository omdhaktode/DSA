package DSA_2;

import java.util.*;
public class ArrayList_Max_Water_55 {
    // Brute Force Approch TC:O(n^2)
  /*   public static int maxWater(ArrayList<Integer> l){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
                int w=j-i;
                int len=Math.min(l.get(i), l.get(j));
                curr=len*w;
                if(curr>max){
                    max=curr;
                }
            }
        }
    return max;
    
    } */

    // Linear Approch TC: O(n)

    public static int maxWater(ArrayList<Integer> l){
        int start=0;
        int end=l.size()-1;
        int curr=0;
        int max=Integer.MIN_VALUE;
        while(start<end){
            int w=end-start;
            int len=Math.min(l.get(start),l.get(end));
            curr=len*w;
            max=Math.max(max,curr);
            if(l.get(start)<l.get(end)){
                start++;
            }else{
                end--;
            }
        }
        return max;
 
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int result=maxWater(list);
        System.out.println(result);
    }
}
