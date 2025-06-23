// second largest no in array

// import java.util.Arrays;

public class Second_Largest {
    
    /* public static int largest(int[] arr){
          Arrays.sort(arr);
          return arr[arr.length-2];

    } */

    public static int largest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

    return max;
 }

    public static int secondlargest(int arr[]){
        int large=largest(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==large){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int result=largest(arr);
        return result;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int result=secondlargest(arr);
        System.out.println("Second largest element is "+result);
    }
}
