package DSA_2;

public class Rcursion_First_Occurance_48 {

    public static int firstOccurance(int[] arr,int key,int index){
        if(index==arr.length-1){
            return -1;
        }

        if(arr[index]==key){
            return index;
        }

        return firstOccurance(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3};
        int key=10;
        int i=firstOccurance(arr,key,0);
        System.out.println(i);
    }
}
