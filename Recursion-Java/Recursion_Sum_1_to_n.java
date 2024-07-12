import java.util.Scanner;
public class Recursion_Sum_1_to_n {
    static int sum1toN(int n){
        if(n == 0)
            return n;
        else
            return n + sum1toN(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.print("Input the Limit -> ");
        limit = sc.nextInt();
        System.out.print("Sum of Natural_numbers from 1 to "+limit+" is -> "+sum1toN(limit));
    }
}
