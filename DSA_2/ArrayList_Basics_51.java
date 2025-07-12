package DSA_2;
import java.util.ArrayList;
public class ArrayList_Basics_51 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println(list);
        System.out.println();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<list.size();i++){
            list.set(i,list.get(i)*10);
        }
        System.out.println(list);
        System.out.println();
        System.out.println(list.contains(110));
    }
}
