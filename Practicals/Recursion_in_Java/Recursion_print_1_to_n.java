import java.util.Scanner;
public class Recursion_print_1_to_n {

    static void printNaturalNumbers(int n){
        if( n == 1){
            System.out.println(n);
            return;
        }
            printNaturalNumbers(n-1);
            System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input a Number : ");
        n = sc.nextInt();
        if(n <= 0)
            System.out.print("N is not a Natural number");
        else
            printNaturalNumbers(n);
    }
}
