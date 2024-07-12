import java.util.Scanner;
public class Matrix_Reverse_each_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Input Rows and Columns -> ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] A = new int[r][c];
        System.out.println("Input "+r+" Row and "+c+" Column Elements ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            int a = 0;
            int b = c-1;
            while (a < b) {
                int temp = A[i][a];
                A[i][a++] = A[i][b];
                A[i][b--] = temp;
            }
        }
        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.format("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
}
