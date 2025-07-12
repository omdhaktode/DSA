package DSA_1;
// no's strictly greater than a key

public class Greater_No {

    public static void greater(int[] arr,int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>key){
                count++;
            }
        }
        System.out.println("In list "+count+" numbers are greater than "+key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key=3;
        greater(arr, key);
    }
}
