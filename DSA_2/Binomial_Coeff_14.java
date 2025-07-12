package DSA_2;

public class Binomial_Coeff_14 {

    public static int fact(int no){
        int result=1;
        for(int i=1;i<=no;i++){
            result*=i;
        }
    return result;
    }

    public static int binomial(int n,int r){
        int N=fact(n);
        int R=fact(r);
        int nMr=fact(n-r);
        int result=N/(R*nMr);
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int result=binomial(n, r);
        System.out.println(result);
        
    }
}
