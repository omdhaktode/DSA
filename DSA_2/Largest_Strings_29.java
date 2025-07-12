package DSA_2;

public class Largest_Strings_29 {

    public static void largest(String[] arr){
        String large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].compareToIgnoreCase(large)>0){
                large=arr[i];
            }
        }
        System.out.println("Largest String is "+large);
    }
    public static void main(String[] args) {
        String arr[]={"Akshs","oms","Waykar","Rahul","Zndu"};
        largest(arr);
    }
}
