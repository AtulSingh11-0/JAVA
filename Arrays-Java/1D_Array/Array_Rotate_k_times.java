import java.util.Scanner;
public class Array_Rotate_k_times {
    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i +" ");
    }
    static void reverseArray(int[] arr, int start, int end){
        while ( start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    static void rotate(int[] arr, int k){
        int n = arr.length;

        k = k % n;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);

        System.out.print("Rotated Array : ");
        printArray(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, rotate;

        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input Rotation value : ");
        rotate = sc.nextInt();

        rotate(A, rotate);
    }
}
