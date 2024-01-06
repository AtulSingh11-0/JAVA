import java.util.Scanner;
public class Recursion_n_Fibonacci_terms {
    static int fibo(int n){
        if(n < 2)
            return n;
        else
            return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, limit = 1;
        System.out.print("Input a Number : ");
        n = sc.nextInt();
        System.out.print("Fibonacci series up to " +n+ " terms : ");
        while (limit <= n){
            System.out.print(fibo(limit) + " ");
            limit++;
        }
    }
}
