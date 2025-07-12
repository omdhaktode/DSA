package DSA_1;
// print first repeating element in an array

public class First_Repeat{

    public static int first(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2};
        int result=first(arr);
        System.out.println(result);

    }
}