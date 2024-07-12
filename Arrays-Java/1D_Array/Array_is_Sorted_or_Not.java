import java.util.Scanner;
public class Array_is_Sorted_or_Not {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        boolean sorted = true;
        System.out.print("Input Array size : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input "+n+" Array elements : ");
        for(i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Array_1 : ");
        printArray(A);

        for(i = 0; i < n-1; i++){
            if(A[i] > A[i+1]) {
                sorted = false;
                break;
            }
        }
        if(sorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is not_Sorted");
    }
}
