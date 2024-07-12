import java.util.Scanner;
public class Recursion_Factorial_from_1_to_N {
    static long Factorial(int n){
        if(n == 0)
            return 1;
        else
            return Factorial(n-1) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit, m = 0;
        System.out.print("Input the limit : ");
        limit = sc.nextInt();
        while(m <= limit){
            System.out.println("Factorial of " + m + " is -> " + Factorial(m));
            m++;
        }
    }
}
