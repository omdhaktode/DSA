package DSA_1;
// to calculate the frequency of number in array

public class Frequenncy_Java{

    public static int freq(int arr[],int key){
        int count=0;
        for(int ele:arr){
            if(key==ele){
                count++;
            }
        }
        if(count==0){
            return -1;
        }
    return count;
    }
    public static void main(String[] args){
        
        int arr[]={1,2,3,4,5,1};
        int key=9;
        int a= freq(arr, key);
        System.out.println(a);
    }
}