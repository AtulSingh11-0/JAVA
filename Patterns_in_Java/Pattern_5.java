import java.util.Scanner;
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size >> ");
        int n = sc.nextInt();

        for(int i = 0; i <= 2 * n-1; i++){
            int totalCol = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalCol; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
