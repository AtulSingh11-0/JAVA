import  java.util.Scanner;

public class Array_Sum_of_All_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,sum = 0;
        System.out.print("Input size of the Array : ");
        n = sc.nextInt();
        int A[] = new int[n];

        System.out.println("Input Array Elements :");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.println("Array Elements are : ");
        for (i = 0; i < n; i++){
            sum += A[i];
            System.out.println("A["+i+"] : "+A[i]);
        }
        System.out.println("Sum of Array elements is : "+sum);
    }
}
