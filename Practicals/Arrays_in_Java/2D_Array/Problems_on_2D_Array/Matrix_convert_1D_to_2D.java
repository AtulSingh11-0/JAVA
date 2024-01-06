import java.util.Scanner;
public class Matrix_convert_1D_to_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, index = 0;
        System.out.print("Input Rows and Columns -> ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[] A = new int[r*c];
        int[][] B = new int[r][c];

        System.out.print("Input 1D_Array Elements -> ");
        for (int i = 0; i < (r*c); i++)
            A[i] = sc.nextInt();

        System.out.println("1D_Array converted into 2D_Array ");
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                B[i][j] = A[index];
                index++;
            }
        }
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.format("%3d", B[i][j]);
            }
            System.out.println();
        }
    }
}
