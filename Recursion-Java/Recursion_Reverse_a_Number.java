import java.util.Scanner;
public class Recursion_Reverse_a_Number {
    static int ans = 0;
    static void reverseNumberMethod_1(int n){
        if(n == 0)
            return;
        System.out.print(n % 10);
        reverseNumberMethod_1(n / 10);
    }
    static int reverseNumberMethod_2(int n){
        int temp;
        if(n == 0)
            return ans;
        if(n > 0){
            temp = n % 10;
            ans = ans * 10 + temp;
            reverseNumberMethod_2(n / 10);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, rev;
        System.out.print("Input a Number : ");
        n = sc.nextInt();
        System.out.print("Reverse using loop is -> ");
        temp = n;
        while(temp != 0){
            rev = temp % 10;
            System.out.print(rev);
            temp /= 10;
        }
        System.out.print("\nReverse using Method 1 is -> ");
        reverseNumberMethod_1(n);
        System.out.println("\nReverse using Method 2 is -> " +reverseNumberMethod_2(n));
    }
}
