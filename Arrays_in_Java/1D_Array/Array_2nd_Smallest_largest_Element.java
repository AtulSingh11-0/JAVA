import java.util.Scanner;
public class Array_2nd_Smallest_largest_Element {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }
    static void Array_Sorter(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Input Array size : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.print("Array_1 : ");
        printArray(A);
        Array_Sorter(A);
        System.out.print("Sorted Array_1 : ");
        printArray(A);
        int[] Min_N_Max = {A[1],A[n-2]};
        printArray(Min_N_Max);
    }
}
