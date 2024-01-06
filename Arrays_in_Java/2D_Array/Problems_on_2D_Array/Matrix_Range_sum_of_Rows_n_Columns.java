import java.util.Scanner;
public class Matrix_Range_sum_of_Rows_n_Columns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, rowStart, rowEnd, colStart, colEnd, sum = 0;
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
        System.out.print("Input Starting and Ending Row -> ");
        rowStart = sc.nextInt();
        rowEnd = sc.nextInt();
        System.out.print("Input Starting and Ending Column -> ");
        colStart = sc.nextInt();
        colEnd = sc.nextInt();

        while(rowStart <= rowEnd){
            int j = colStart;
            while (j <= colEnd){
                sum += A[rowStart][j];
                j++;
            }
            rowStart++;
        }
        System.out.println("Sum is -> "+sum);
    }
}
