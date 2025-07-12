package DSA_1;
/* Print following pattern 5 x 5
 * * * * 
 * * * * 
 * * * * 
 * * * * 
 */
public class Pattern1 {

    public static void pattern(int no){
        for(int i=0;i<no;i++){
            for(int j=0;j<no;j++){
                System.out.print("*"+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern(n);
    }
}
