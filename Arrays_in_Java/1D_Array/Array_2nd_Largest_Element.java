import java.util.Scanner;
public class Array_2nd_Largest_Element {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if( max < i)
                max = i;
        }
        return max;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, max;

        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Array_1 : ");
        printArray(A);

        max = maxElement(A);
        for( i = 0; i < n; i++){
            if( A[i] == max)
                A[i] = Integer.MIN_VALUE;
        }

        max = maxElement(A);
        System.out.printf("2nd Largest Element in the Array is : "+max);
    }
}