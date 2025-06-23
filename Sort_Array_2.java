// sort array is 0's 1's using two pointer approch

public class Sort_Array_2 {

    public static int[] swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    return arr;
    }

    public static int[] sort(int[] arr){
       int left=0;
       int right=arr.length-1;
       while(left<right){
            if(arr[left]==1 &&  arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,0,0};
        arr=sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
