import java.util.Scanner;
public class j01004 {
    public static int snt(int n){
        if(n < 2) return 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++){
            if (n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            if (snt(n) == 1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
