package DSA_1;
// find unique element in an array 

public class Unique_Elements {
   
//    public static int unique(int[] arr){
       
//       for(int i=0;i<arr.length;i++){
//         boolean b=true;
//         for(int j=0;j<arr.length;j++){
//             if(i!=j && arr[i]==arr[j]){
//                  b=false;
//                  break;
//             }
//         }
//         if(b){
//             return arr[i];
//         }
//       }
//     return -1;      
//    }

// Method 2 using XOR(^) which is most efficient
    // public static int unique(int[] arr){
    //     int result=0;
    //     for(int ele:arr){
    //         result^=ele;
    //     }
    // return result;
    // }

// Method3 using array manipulation

    public static int unique(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int ele:arr){
            if(ele>0){
                return ele;
            }
        }
    return -1;

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        int result=unique(arr);
        System.out.println("Unique element from an array is "+result);
    }
}
