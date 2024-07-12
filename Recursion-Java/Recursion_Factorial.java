import java.util.Scanner;
public class Recursion_Factorial {
    static int Factorial(int n){
        if(n == 0)
            return 1;
        else
            return Factorial(n-1) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input a Number : ");
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is -> " + Factorial(n));
    }
}
