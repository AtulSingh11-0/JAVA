import java.util.Scanner;

public class Sourav_perWeek_CP_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            
            int c = 0;
            for(int i = 0; i < n; i++) {
                if(a[i] >= 10) ++c;
            }
            System.out.println(c);
        }
    }
}