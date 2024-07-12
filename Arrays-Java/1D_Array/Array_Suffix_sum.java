import java.util.Scanner;
public class Array_Suffix_sum {
    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    static void suffixSummer(int[] arr){
        for( int i = arr.length-2; i >= 0; i--)
            arr[i] += arr[i+1];
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Original Array : ");
        printArray(A);
        suffixSummer(A);
        System.out.print("\nPrefix Array : ");
        printArray(A);
    }
}
