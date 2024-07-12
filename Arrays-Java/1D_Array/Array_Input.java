import  java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Input Array Elements :");
        for(i = 0; i < n; i++)
            A[i] = sc.nextInt();

        /* using for loop
        System.out.println("Array Elements are :");
        for (i = 0; i < n; i++)
            System.out.println("A["+i+"] : "+A[i]);
            */

        /*using for each loop
        System.out.println("Array Elements are :");
        for (int i1 : A)
            System.out.println("A[] : "+i1);
            */

        /*using while loop*/
        System.out.println("Array Elements are :");
        i = 0;
        while (i < n){
            System.out.println("A["+i+"] : "+A[i]);
            ++i;
        }
    }
}