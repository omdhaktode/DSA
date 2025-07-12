package DSA_2;

public class Recursion_Square_50 {
  // normal  TC -> O(n)
    /* public static int squ(int n,int pow){
        if(pow==0){
            return 1;
        }

        return n*squ(n, pow-1);
    } */

//optimized TC-> O(log n)
    public static int squ(int n,int pow){
        if(pow==0){
            return 1;
        }
        int halfpower=squ(n, pow/2);
        int result=halfpower*halfpower;
        if(pow%2 !=0){
            result=n*result;
        }
        return result;
    }
    public static void main(String[] args) {
        int no=2;
        int pow=10;
        int result=squ(no,pow);
        System.out.println(result);
    }
}
