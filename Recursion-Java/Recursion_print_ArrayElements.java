import java.util.Scanner;
public class Recursion_print_ArrayElements {
    static void printArrayRecursively(int[] A, int n){
        if(n == 0){
            System.out.print(A[n] + " ");
            return;
        }
        printArrayRecursively(A, n-1);
        System.out.print(A[n] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input size of the array -> ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input Array elements -> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Array Elements -> ");
        printArrayRecursively(a,n-1);

    }
}
