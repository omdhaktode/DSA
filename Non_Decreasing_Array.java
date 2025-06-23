// find an array which consist squares of no in non decreasing order 
public class Non_Decreasing_Array {

    public static int[] reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    return arr;
    
    }

    public static int[] non_decs(int[] arr){
        int newarr[]=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        int j=0;
        while(left<=right){
          if(Math.abs(arr[left])>Math.abs(arr[right])){
            newarr[j++]=arr[left]*arr[left];
            left++;
          }else{
            newarr[j++]=arr[right]*arr[right];
            right--;
          }
        }
        reverse(newarr);
    return newarr;
    }
    public static void main(String[] args) {
        int arr[]={-2,-1,1,2,3};
        arr=non_decs(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
}
