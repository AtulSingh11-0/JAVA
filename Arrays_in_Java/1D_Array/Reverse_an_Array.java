import java.util.Scanner;
public class Reverse_an_Array {
    static void printArray(int[] arr){
        for( int i : arr){
            System.out.print(i +" ");
        }
    }
    static void reverseArray_1(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] +" ");
        }
    }
    static void reverseArray_2(int[] arr){
        int start, end;
        start = 0;
        end = arr.length-1;
        while(start < end){
            int temp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = temp;
        }
        printArray(arr);
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

        System.out.print("Reverse_Method 1 : ");
        reverseArray_1(A);
        System.out.print("\nReverse_Method 2 : ");
        reverseArray_2(A);
    }
}
