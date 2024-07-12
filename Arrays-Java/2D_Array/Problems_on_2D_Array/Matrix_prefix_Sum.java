import java.util.Scanner;
public class Matrix_prefix_Sum {
    static void prefixSum(int[][] A, int r, int c){
//        int n = A.length;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c-1; j++){
                A[i][j+1] += A[i][j];
                A[j+1][i] += A[j][i];
            }
        }
    }
    static void printArray(int[][] A){
        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++)
                System.out.format("%3d", A[i][j]);
            System.out.println();
        }
    }
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
        prefixSum(A, r, c);
        System.out.println("Prefix Sum of Matrix ");
        printArray(A);
    }
}
