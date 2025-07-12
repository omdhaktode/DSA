package DSA_1;
import java.util.ArrayList;
import java.util.Collections;

public class String_Sort {

    public static void reverse(ArrayList<String> arr){
        Collections.sort(arr);
        System.out.println("Sorting list is "+arr);
        
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("after reverse list is "+arr);
    }
    public static void main(String[] args) {
        
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Akash");
        arr.add("Ashwin");
        arr.add("Ashish");
        arr.add("Abhay");
        arr.add("Alhok");
        arr.add("Aman");

        reverse(arr);
    }
}
