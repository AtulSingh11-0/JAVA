import java.util.Scanner;
public class Roys_DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        while(n-- > 0){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w < l || h < l)
                System.out.println("UPLOAD ANOTHER");
            else if (w > l && h > l)
                System.out.println("CROP IT");
            else
                System.out.println("ACCEPTED");
        }
    }
}
