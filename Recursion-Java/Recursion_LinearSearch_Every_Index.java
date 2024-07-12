import java.util.Scanner;
public class Recursion_LinearSearch_Every_Index{
    static void findAllIndices(int[] A, int n, int len, int search){
        // base case
        if(n >= len) {
            System.out.println("Element not found");
            return;
        }
        // self work
        if(A[n] == search)
            System.out.println("Element found at " + n + " Index Position");
        // recursive work
        findAllIndices(A, n + 1, len, search);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.print("Input size of the array -> ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input Array elements -> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Input the Number you want to search -> ");
        x = sc.nextInt();
        findAllIndices(a, 0, n, x);
    }
}