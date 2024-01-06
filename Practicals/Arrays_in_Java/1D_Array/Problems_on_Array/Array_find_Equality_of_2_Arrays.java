import java.util.Scanner;
public class Array_find_Equality_of_2_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean equality = true;
        System.out.print("Input size of Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        System.out.print("Input " +n+ " elements for Array_1 : ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input " +n+ " elements for Array_2 : ");
        for (int i = 0; i < n; i++){
            B[i] = sc.nextInt();
            if(B[i] != A[i]) {
                equality = false;
                break;
            }
        }
        System.out.println(equality);
    }
}