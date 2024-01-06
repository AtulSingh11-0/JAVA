import java.util.Scanner;

public class Max_BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            while(k-- > 0) {
                if(s.charAt(0) == '0') {
                    s = '1' + s.substring(1);
                } else {
                    s = s + '0';
                }
            }
            System.out.println(s);
        }
    }
}