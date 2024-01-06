import java.util.Scanner;
public class Array_Even_Odd_Sorter {

    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void evenOddSorter(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while ( left < right){
            if( arr[right] % 2 == 0 && arr[left] % 2 != 0 )
                swap(arr,left++,right--);
            if(arr[left] % 2 == 0)
                left++;

            if(arr[right] % 2 != 0)
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
        evenOddSorter(A);
        System.out.print("\nSorted Array : ");
        printArray(A);
    }
}
