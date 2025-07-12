package DSA_1;
// prefix sum using suffix if both are equal return true else return false

public class PrfixSum_Suffix{

    public static int totalsum(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
    return total;
    }

    public static boolean check(int[] arr){
        int total=totalsum(arr);
        int prefix=0;
        for(int i=0;i<arr.length-1;i++){
            prefix+=arr[i];
            int suffix=total-prefix;
            if(suffix==prefix){
                return true;
            }
        }
    return false;
      
    }
    public static void main(String[] args){
        int arr[]={1,1,1,1,1,1};
        System.out.println(check(arr));
    }
}