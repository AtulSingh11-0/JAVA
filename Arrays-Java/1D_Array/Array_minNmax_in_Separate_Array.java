import java.util.Scanner;
public class Array_minNmax_in_Separate_Array {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, max, min;
        System.out.print("Input Array size : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();
        max = min = A[0];
        System.out.print("Array_1 : ");
        printArray(A);
        for (i = 0; i < n; i++){
            if(min > A[i])
                min = A[i];
            if(max < A[i])
                max = A[i];
        }
        int[] MinNmax = {min,max};
        System.out.print("Smallest and Largest Element in_Array : ");
        printArray(MinNmax);
    }
}
