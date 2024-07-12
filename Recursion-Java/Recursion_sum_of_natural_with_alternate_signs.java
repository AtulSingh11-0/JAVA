import java.util.Scanner;
public class Recursion_sum_of_natural_with_alternate_signs {
    static int sumFinder(int n){
        if(n == 0)
            return 0;
        if(n % 2 == 1)
            return sumFinder(n - 1) + n;
        else
            return sumFinder(n - 1) - n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.print("Input the Limit -> ");
        limit = sc.nextInt();
        System.out.println(sumFinder(limit));
    }
}
