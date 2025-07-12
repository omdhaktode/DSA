package DSA_2;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayList_Sort_53 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(11);
        l.add(1);
        l.add(2);
        l.add(11);
        l.add(111);
        l.add(1111);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
       Collections.sort(l,Collections.reverseOrder());
       System.out.println(l);

    }    
}
