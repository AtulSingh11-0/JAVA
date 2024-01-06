import java.util.Scanner;
public class Array_Squared_n_Sorted_Elements {
    static void arrayElementsSquarer(int[] A){
        for(int i = 0; i < A.length; i++)
            A[i] *= A[i];
    }
    static void arraySorter(int[] A){
        for(int i = 0; i < A.length-1; i++){
            for(int j = i+1; j < A.length; j++){
                if(A[j] < A[i]){
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }
    static void printArray(int[] A){
        for(int i : A)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input size of Array : ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Input array Elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        arrayElementsSquarer(A);
        arraySorter(A);
        printArray(A);
    }
}
