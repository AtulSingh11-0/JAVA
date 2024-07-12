import java.util.Scanner;
public class Array_difference_between_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, diff;
        boolean check = false;
        System.out.print("Input size of the Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input absolute Difference -> ");
        diff = sc.nextInt();

        for (int i = 0; i < n-1; i++){
            for(int j = 1; j < n; j++) {
                if ((A[i] - A[j]) == diff) {
                    check = true;
                    break;
                }
            }
        }
        System.out.println(check);
    }
}
