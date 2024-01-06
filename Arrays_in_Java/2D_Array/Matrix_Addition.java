import java.util.Scanner;
public class Matrix_Addition {
    static void printMatrix(int[][] a){
        for(int i = 0; i < a.length; i++ ) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.format("%3d",a[i][j]);
            }
            System.out.println();
        }
    }

    static void matrixAddition(int[][] A, int[][] B, int r, int c){
        int[][] C = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        printMatrix(C);
    }

    public static void main(String[] args) {
        System.out.println("* Note *");
        System.out.println("Entered rows and columns for both the matrix A and B should be equal");
        Scanner sc = new Scanner(System.in);

        int i, j, r1, r2, c1, c2;
        System.out.print("Input Rows and Columns for Matrix_A: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Input Rows and Columns for Matrix_A: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if( r1 == r2 && c1 == c2) {
            int[][] A = new int[r1][c1];
            int[][] B = new int[r2][c2];

            System.out.println("Input " + r1 + " row Elements and " + c1 + " column Elements for Matrix_A");
            for (i = 0; i < r1; i++)
                for (j = 0; j < c1; j++)
                    A[i][j] = sc.nextInt();

            System.out.println("Input " + r2 + " row Elements and " + c2 + " column Elements for Matrix_B");
            for (i = 0; i < r2; i++)
                for (j = 0; j < c2; j++)
                    B[i][j] = sc.nextInt();

            System.out.println("Matrix_A : ");
            printMatrix(A);
            System.out.println("Matrix_B : ");
            printMatrix(B);
            System.out.println("Resultant Matrix_C : ");
            matrixAddition(A, B, r1, c2);
        } else System.out.println("Wrong Input");
    }
}
