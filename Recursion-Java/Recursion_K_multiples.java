import java.util.Scanner;
public class Recursion_K_multiples {
    static void multiplePrinter(int num, int k){
        if(num == 0) {
            System.out.print(num);
            return;
        }
        if(k > 0) {
            multiplePrinter(num, k - 1);
            System.out.print(num * k + ", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, k;
        System.out.print("Input a Number -> ");
        num = sc.nextInt();
        System.out.print("Input no.of Multiples you want -> ");
        k = sc.nextInt();
        multiplePrinter(num, k);
    }
}
