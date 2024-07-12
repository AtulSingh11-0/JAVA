import java.util.Scanner;

public class Count_Eve_N_Odd_inList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int ec, oc;
            ec = oc = 0;

            for(int i = 0; i < n; i++) {
                if(a[i] % 2 == 0)   ++ec;
                else    ++oc;
            }
            System.out.println(ec);
            System.out.println(oc);
        }
    }
}
