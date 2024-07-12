import java.util.Scanner;
public class Array_print_kth_smallest_Element {
    static Scanner sc = new Scanner(System.in);
    static void printArray(int[] A){
        for(int i : A)
            System.out.print(i + " ");
        System.out.println();
    }

    static void sortArray(int[] A){
        int temp, n = A.length;
        for(int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n,k;
        System.out.print("Input size of Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];

        //taking input of Array elements
        System.out.print("Input " +n+ " elements for Array : ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input the value of k -> ");
        k = sc.nextInt();

        sortArray(A);
        System.out.print("Array is -> "); printArray(A);
        System.out.print("kth smallest element in the array is -> " + A[k-1]);
    }
}