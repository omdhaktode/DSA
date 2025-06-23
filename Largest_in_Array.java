// find largest in array

public class Largest_in_Array {

    public static void largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }
        }
        System.out.println("Maximum of array is "+max);
    }
    public static void main(String[] args) {
        int arr[]={1,2,33,4,5,6};
        largest(arr);
    }
}
