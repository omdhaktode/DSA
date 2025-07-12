package DSA_2;

public class SubArrays_21 {

    public static void subarrays(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
            System.out.println();
            count++;
            }
        System.out.println();
        }
    System.out.println("Total SubArrays: "+count);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        subarrays(arr);
    }
}
