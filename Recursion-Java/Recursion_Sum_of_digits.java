import java.util.Scanner;
public class Recursion_Sum_of_digits {
    static int sumOfDigits(int n){
        if(n == 0)
            return 0;
        else
            return n % 10 + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input a Number : ");
        n = sc.nextInt();
        System.out.println("Sum of Digits of " +n+ " is -> " +sumOfDigits(n));
    }
}

