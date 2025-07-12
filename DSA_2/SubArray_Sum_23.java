package DSA_2;

public class SubArray_Sum_23 {

    public static void print(int[] newarr){
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }

    public static int prefix(int[] arr){
        int newarr[]=new int[arr.length];
        newarr[0]=arr[0];
        int Max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=1;i<newarr.length;i++){
            newarr[i]=arr[i]+newarr[i-1];
        }
        print(newarr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr=i==0? newarr[j]: newarr[j]-newarr[i-1];
                if(Max<curr){
                    Max=curr;
                }
            }
        }
        return Max;

    }
    public static void main(String[] args) {
        int arr[]={9,2,3,4,-5};
        int result=prefix(arr);
        System.out.println();
        System.out.println("Maximum sum is "+result);
    }
}
