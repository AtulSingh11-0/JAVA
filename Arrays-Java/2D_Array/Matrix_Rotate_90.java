import java.util.Scanner;
public class Matrix_Rotate_90 {
    static void printMatrix(int[][] a){
        for(int i = 0; i < a.length; i++ ) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.format("%3d",a[i][j]);
            }
            System.out.println();
        }
    }
    static void printReverse(int[][] a){
        for(int i = 0; i < a.length; i++ ) {
            for (int j = a[0].length-1; j >= 0; j--) {
                System.out.format("%3d",a[i][j]);
            }
            System.out.println();
        }
    }
    static void matrixTranspose(int[][] a, int r, int c){
        for(int i = 0; i < r; i++ ) {
            int temp;
            for (int j = i; j < c; j++) {
                temp = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, r, c;
        System.out.print("Input Rows and Columns for Matrix : ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] A = new int[r][c];

        System.out.println("Input " + r + " row Elements and " + c + " column Elements for Matrix ");
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Matrix : ");
        printMatrix(A);
        System.out.println("Matrix after 90_degree Rotation: ");
        matrixTranspose(A, r, c);
        printReverse(A);
    }
}

