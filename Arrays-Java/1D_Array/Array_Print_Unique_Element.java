import java.util.Scanner;
public class Array_Print_Unique_Element {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, j, ans = -1;

        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Array_1 : ");
        printArray(A);

        for( i = 0; i < n; i++){
            for( j = i+1; j < n; j++){
                if(A[i] == A[j]){
                    A[i] = A[j] = -1;
                }
            }
        }

        for ( i = 0; i < n; i++){
            if( A[i] > 0)
                ans = A[i];
        }
        System.out.printf("\nUnique Element : "+ans);
    }
}
