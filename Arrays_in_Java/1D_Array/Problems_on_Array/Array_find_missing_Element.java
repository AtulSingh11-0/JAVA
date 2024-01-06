import java.util.Arrays;
import java.util.Scanner;
public class Array_find_missing_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 1;
        System.out.print("Input size of the Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        Arrays.sort(A);

        for (int i = 0; i < n; i++){
            if(count != A[i])
                break;
            count++;
        }
        System.out.println(count);
    }
}
