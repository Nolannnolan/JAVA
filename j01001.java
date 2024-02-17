import java.util.Scanner;
public class j01001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        if (r <= 0 || d <= 0) System.out.print(0);
        else System.out.print((2 * (d + r)) + " "  + (d * r));
    }
}
