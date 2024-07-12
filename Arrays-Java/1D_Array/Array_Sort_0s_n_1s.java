import java.util.Scanner;
public class Array_Sort_0s_n_1s {
    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    static int countZeroes(int[] arr){
        int zeroes = 0;
        for( int i : arr ){
            if(i == 0)
                ++zeroes;
        }
        return zeroes;
    }

    static void arraySorter(int[] arr){
        int zeroes = countZeroes(arr);
        for(int i = 0; i < arr.length; i++){
            if(zeroes > 0) {
                arr[i] = 0;
                --zeroes;
            } else arr[i] = 1;
        }
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
        arraySorter(A);
        System.out.print("\nSorted Array : ");
        printArray(A);
    }
}
