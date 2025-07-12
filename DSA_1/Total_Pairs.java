package DSA_1;
// code for to find total no of pairs which sum is equal to the target

public class Total_Pairs {
    
    public static int total_pairs(int[] arr,int target){
        int pairs=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    pairs++;
                }
            }
        }
    return pairs;

    }
    public static void main(String[] args) {
        int[] arr={4,6,3,5,8,2};
        int target=7;
        int result=total_pairs(arr,target);
        System.out.println("Total no of pairs is "+result);
    }
}
