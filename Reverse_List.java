// reverse a list 
import java.util.*;
public class Reverse_List {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        int no=1;

        while(no<11){
            int result=5;
            list.add(result +15-no);
            no++;
        }

        Collections.sort(list.reversed());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        } 
    }
}
