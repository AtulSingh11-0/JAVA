import java.util.Scanner;

public class ODI_match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            x -= y;
            z = 50 - z;
            System.out.printf("%.2f",(double)x/z);
        }
    }
}