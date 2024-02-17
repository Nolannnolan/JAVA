import java.util.Scanner;
public class j01006 {

    public static long[] f = new long[101];

    public static boolean fibo(long n){
        for (long i : f) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        f[1] = 1;
        f[2] = 1;

        for(int i = 3 ; i < 101 ; i ++){
            f[i] = f[i-1] + f[i-2];
        }
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(fibo(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}