import java.util.Scanner;
public class Matrix_Pascals_Triangle {
    static void printMatrix(int[][] a){
        for(int i = 0; i < a.length; i++ ) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%3d",a[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] pascalsTriangle(int n){
        int[][] A = new int[n][];
        for(int i = 0; i < n; i++) {
            //since ith row has i+1 columns
            A[i] = new int[i+1];
            //1st and last element of every row is 1
            A[i][0] = A[i][i] = 1;
            for( int j = 1; j < i; j++){
                A[i][j] = A[i-1][j] + A[i-1][j-1];
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Input n : ");
        n = sc.nextInt();
        int[][] A = pascalsTriangle(n);
        printMatrix(A);
    }
}
