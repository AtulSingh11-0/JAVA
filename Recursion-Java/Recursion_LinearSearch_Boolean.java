import java.util.Scanner;
public class Recursion_LinearSearch_Boolean {
    static boolean elementFinder(int[] A, int n, int len, int search){
        // base case
        if(A[n] == search) {
            System.out.println("Element found at " + n + " Index Position");
            return true;
        }else if(n == len-1) // self work
            return false;
        else return elementFinder(A, n+1, len, search); // recursive work
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
        System.out.println(elementFinder(a, 0, n, x));
    }
}
