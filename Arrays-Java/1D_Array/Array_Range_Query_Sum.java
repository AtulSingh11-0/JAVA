import java.util.Scanner;
public class Array_Range_Query_Sum {
    static void printArray(int[] arr){
        for(int i = 1; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static int[] prefixSummer(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, l, r, q;

        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n+1];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 1; i <= n; i++)
            A[i] = sc.nextInt();

        System.out.print("Original Array : ");
        printArray(A);
        int[] prefix = prefixSummer(A);

        System.out.print("\nInput no. of Queries : ");
        q = sc.nextInt();

        while (q-- > 0){
            System.out.print("Input the Range : ");
            l = sc.nextInt();
            r = sc.nextInt();
            System.out.println("Result for the given Range : "+(prefix[r] - prefix[l-1]));
        }
    }
}
