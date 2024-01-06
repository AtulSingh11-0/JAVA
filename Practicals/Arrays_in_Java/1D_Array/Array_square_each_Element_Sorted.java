import java.util.Scanner;
public class Array_square_each_Element_Sorted {

    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void arraySquarer(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }
    }

    static void arraySorter(int[] arr){
        int n = arr.length;
        for ( int i = 0; i < n-1; i++){
            for ( int j = i+1; j < n; j++){
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
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
        System.out.print("\nSorted Array : ");
        arraySquarer(A);
        arraySorter(A);
        printArray(A);
    }
}
