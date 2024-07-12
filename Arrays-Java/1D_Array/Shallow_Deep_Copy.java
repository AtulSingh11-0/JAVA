import java.util.Scanner;

public class Shallow_Deep_Copy {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Input size of array : ");
        n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
/*
        System.out.print("Input "+n+" Elements for array_A : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Array 1 : ");
        printArray(A);

        B = A;
        System.out.print("Array 2 : ");
        printArray(B);

        System.out.print("Input "+n+" Elements for array_B : ");
        for (i = 0; i < n; i++)
            B[i] = sc.nextInt();

        System.out.print("Array 1 revised : ");
        printArray(A);
        System.out.print("Array 2 revised : ");
        printArray(B);
        */

        /* since in the above piece of code shallow copy is happening
        * since both arrays A[] and B[] are sharing the same indexes for their elements at the same index
        * because there are 3 references declared in the memory stack for both the arrays but the heap location has
        * assigned both the arrays their same memory addresses
        * so to overcome this problem clone method is used <array_u_want_to_copy>.clone();*/

        System.out.print("Input "+n+" Elements for array_A : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Array 1 : ");
        printArray(A);

        B = A.clone();
        System.out.print("Array 2 : ");
        printArray(B);

        System.out.print("Input "+n+" Elements for array_B : ");
        for (i = 0; i < n; i++)
            B[i] = sc.nextInt();

        System.out.print("Array 1 revised : ");
        printArray(A);
        System.out.print("Array 2 revised : ");
        printArray(B);
    }
}
