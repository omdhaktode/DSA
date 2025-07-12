package DSA_2;

public class Recursion_1_to_n_43 {

    public static void recursive(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        recursive(n-1);
        System.err.print(n+" ");
    }
    public static void main(String[] args) {
        int n=20;
        recursive(n);
    }
}
