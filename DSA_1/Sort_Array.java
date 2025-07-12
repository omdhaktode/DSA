package DSA_1;
// sort an array of 0's and 1's 

public class Sort_Array {

    public static int[] sort(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(count>0){
                arr[i]=0;
                count--;
            }else{
                arr[i]=1;
            }
        }
    return arr;
    }
    public static void main(String[] args){
        int[] arr={1,0,0,1,0,0,1,1};
        arr=sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
