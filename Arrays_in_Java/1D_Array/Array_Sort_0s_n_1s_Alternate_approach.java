import java.util.Scanner;
public class Array_Sort_0s_n_1s_Alternate_approach {
    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void arraySorter(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while ( left < right){
            if( arr[left] == 1 && arr[right] == 0)
                swap(arr,left++,right--);
            if(arr[left] == 0)
                left++;

            if(arr[right] == 1)
                right--;
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
