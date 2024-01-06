import java.util.Scanner;
public class Recursion_Max_ArrayElement {
    static int printMaxElement(int[] A, int n, int len){
        if(n == len-1)
            return A[n];
        return Math.max(A[n], printMaxElement(A, n+1, len));
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
        System.out.print("Max Element in the Array is -> " + printMaxElement(a, 0, n));
    }
}
