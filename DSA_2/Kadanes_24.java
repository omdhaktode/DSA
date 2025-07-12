package DSA_2;

// max sum of array using  kadanes algorithm
public class Kadanes_24 {

    public static void kadanes(int[] arr){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
        ms=Math.max(ms, cs);
        }
    System.out.println("Maximum sum of array is "+ms);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        kadanes(arr);
    }
}
