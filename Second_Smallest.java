// code to find second smallest element from an array

public class Second_Smallest {

    public static int smallest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
    return min;
}
    public static int second_smallest(int[] arr){
      
        int small=smallest(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==small){
                arr[i]=Integer.MAX_VALUE;
            }
        }

        int result=smallest(arr);
    return result;

    }
    public static void main(String[] args) {
        int arr[]={15,67,10,55,11};
        System.out.println(second_smallest(arr));
   }
}
