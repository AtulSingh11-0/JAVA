import java.util.Scanner;
public class Matrix_Input {
    static void printMatrix(int[][] a, int r, int c){
        for(int i = 0; i < r; i++ ) {
            for (int j = 0; j < c; j++) {
                System.out.format("%3d",a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, r, c;
        System.out.print("Input Rows and Columns : ");
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Input " +r+ " row Elements and " +c+ " column Elements");
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Matrix : ");
        printMatrix(a, r, c);
    }
}
