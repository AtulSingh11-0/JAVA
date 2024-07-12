import java.util.Scanner;

public class Array_Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, max, min;
        System.out.print("Input size of the Array : ");
        n = sc.nextInt();
        int A[] = new int[n];

        System.out.println("Input Array Elements :");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();
        max = min = A[0];
        System.out.println("Array Elements are : ");
        for (i = 0; i < n; i++) {
            System.out.println("A[" + i + "] : " + A[i]);
            if (max < A[i])
                max = A[i];
            if (min > A[i])
                min = A[i];
        }
        System.out.println("\nMin : " + min);
        System.out.println("Max : " + max);
    }
}
