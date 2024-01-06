import java.util.Scanner;
public class Array_print_twice_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input size of the Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++){
                if(A[i] == A[j]) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}

