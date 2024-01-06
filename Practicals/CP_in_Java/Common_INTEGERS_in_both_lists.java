import java.util.Scanner;

public class Common_INTEGERS_in_both_lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            for(int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            int count = 0;

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(a[i] == b[j])    ++count;
                }    
            }
            System.out.println(count);
        }
    }
}
