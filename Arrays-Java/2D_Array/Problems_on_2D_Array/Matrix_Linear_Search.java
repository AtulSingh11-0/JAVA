import java.util.Scanner;
public class Matrix_Linear_Search {
    static void printArray(int[][] A){
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                System.out.format("%3d",A[i][j]);
            }
            System.out.println();
        }
    }
    static void linearSearch(int[][] A, int search){
        int count = 0;
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                if(A[i][j] == search) {
                    count++;
                    System.out.println("Element found at index["+i+", "+j+"]");
                }
            }
        }
        if(count == 0)
            System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, searchElement;
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
        System.out.print("Input Element you want to Search -> ");
        searchElement = sc.nextInt();
        printArray(A);
        linearSearch(A, searchElement);
    }
}
