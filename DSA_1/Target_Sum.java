package DSA_1;
// code for count the pairs of target value is equal to triplet value of an array

public class Target_Sum {
    
    public static int target_sum(int[] arr,int target){
        int len=arr.length;
        int count=0;

        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=j+1;k<len;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
    return count;

    }
    public static void main(String[] args) {
        int[] arr={1,4,5,6,3};
        int target=12;
        int result=target_sum(arr, target);
        System.out.println("Total no of pairs is "+result);

    }
}
