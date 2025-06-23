// code for array data

public class Array {
    // public static void main(String[] args) {
    //     int no[]=new int[3];
    //     // int arr[]={2,34,4};

    //     no[0]=1;
    //     no[1]=3;
    //     no[2]=4;
    //     for(int i=0;i<no.length;i++){
    //         System.out.print(no[i]+" ");
    //     }

    // }

    public static void func(int a,int arr[]){
            a=20;
            for(int i=0;i<arr.length;i++){
                arr[i]=arr[i]+10;
            }
    }
    public static void main(String[] args) {
        int a=10;
        int arr[]={10,20,30};
        func(a, arr);
        System.out.println(a);
        for(int elements: arr){
            System.out.print(elements+" ");
        }
       
}
}
