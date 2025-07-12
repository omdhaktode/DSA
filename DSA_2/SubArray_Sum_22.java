package DSA_2;
// sub array sum using brute force approch
public class SubArray_Sum_22 {

    public static int maxSum(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
            System.out.println(currsum);
            if(currsum>maxsum)
                maxsum=currsum;{
            }
         }
        }
    return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int result= maxSum(arr);
        System.out.println("Maximum sum is "+result);
    }
}
