import java.util.Scanner;
public class Recursion_Palindrome_Check {
    static int palindromeChecker(int n, int rev){
        if(n == 0)
            return rev;
        rev *= 10;
        return palindromeChecker(n / 10, rev += n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, rev;
        System.out.print("Input a Number : ");
        n = sc.nextInt();
        rev = 0;
        int a = Integer.MAX_VALUE;
        temp = n;
        while (temp != 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(rev == n)
            System.out.println(rev + " is a Palindrome no.");
        else
            System.out.println(n + " is not a Palindrome no.");

        if(palindromeChecker(n, 0) == n)
            System.out.println(n + " is a Palindrome no.");
        else
            System.out.println(n + " is not a Palindrome no.");
    }
}
