import java.util.Scanner;
public class Array_1st_repetitive_Element {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }
    static int repetitiveElement(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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

        System.out.print("Array_1 : ");
        printArray(A);

        System.out.println("First Repeating_Number : "+ repetitiveElement(A, n));
    }
}