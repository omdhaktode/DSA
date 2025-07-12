package DSA_2;

public class Recursion_IsSorted_47 {

    public static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        
        return isSorted(arr, index+1);
        
    }
    public static void main(String[] args) {
        int arr[]={4,2,3,4,5};
        int index=0;
        boolean b=isSorted(arr,index);
        System.out.println(b);
    }
}
