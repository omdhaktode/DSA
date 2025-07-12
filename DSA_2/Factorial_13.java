package DSA_2;

public class Factorial_13 {

    public static int fact(int n){
        int result=1;
        while(n>0){
            result*=n;
            n--;
        }
    return result;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(fact(a));
    }
}
