import java.util.Scanner;
public class Recursion_Min_ArrayElement {
    static int printMinElement(int[] A, int n, int len){
        if(n == len-1)
            return A[n];
        return Math.min(A[n], printMinElement(A, n+1, len));
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
        System.out.print("Min Element in the Array is -> " + printMinElement(a, 0, n));
    }
}
