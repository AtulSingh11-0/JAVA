import java.util.Scanner;
public class Array_target_Sum {
    static void indices(int[] A, int target){
        for(int i = 0; i < A.length; i++){
            for (int j = i+1; j < A.length; j++){
                if((A[i] + A[j]) == target) {
                    System.out.println("["+(i+1)+", "+(j+1)+"]");
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, targetSum;
        System.out.print("Input size of Array : ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Input array Elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input the Target_Sum : ");
        targetSum = sc.nextInt();
        indices(A, targetSum);
    }
}
