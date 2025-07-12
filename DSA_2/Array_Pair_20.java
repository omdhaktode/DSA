package DSA_2;

public class Array_Pair_20 {

    public static void pairs(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                count++;
            }
        System.out.println();
        }
    System.out.println("Total no of pairs is "+count);
    }
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    pairs(arr);
   } 
}
