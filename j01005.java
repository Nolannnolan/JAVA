import java.util.Scanner;
public class j01005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            double h = sc.nextInt();
            double s = h / 2;
            double chia = s / n;
            double tong = 0;
            for (int i = 1; i < n ;i++){
                tong = chia * i;
                System.out.format("%.6f ", Math.sqrt(tong * 2 * h));

            }
            t--;
            System.out.println();
        }
    }
}
