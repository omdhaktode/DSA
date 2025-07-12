package DSA_1;
// Sort an array followed by even and odd no's using two pointer approch

public class Sort_Array_Even_Odd {

    public static int[] swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return arr;
    }

    public static int[] sort(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]%2 !=0 && arr[end]%2==0){
                swap(arr,start,end);
                start++;
                end--;
            }
            if(arr[start]%2==0){
                start++;
            }
            if(arr[end]%2!=0){
                end--;
            }
        }
    return arr;
    }
    public static void main(String[] args){
        int arr[]={1,2,4,3,2};
        arr=sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
