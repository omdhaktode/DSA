package DSA_1;
// code to find 
import java.util.*;
public class TCS{
   
   public static void solution(int arr[],int left,int right){
    int subSize = right - left + 1;
    int[] subArray = new int[subSize];
    for (int i = 0; i < subSize; i++) {
        subArray[i] = arr[left - 1 + i];
    }

    // Step 5: Check frequency and print 1 for elements with frequency 1
    for (int i = 0; i < subSize; i++) {
        int count = 0;
        for (int j = 0; j < subSize; j++) {
            if (subArray[i] == subArray[j]) {
                count++;
            }
        }
        if (count == 1) {
            System.out.print("1 ");
        }
    }
}
   
   
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      int arr[]=new int[no];
      int R=sc.nextInt();
      int L=sc.nextInt();

      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
     
      solution(arr, L, R);
      sc.close();

    }
}