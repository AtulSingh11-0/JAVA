import java.util.Scanner;
public class Array_Unique_elements {
    static void arraySorter(int[] A){
        for(int i = 0; i < A.length-1; i++){
            for(int j = i+1; j < A.length; j++){
                if (A[i] > A[j]) {
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, count = 0;
        System.out.print("Input no.of unique elements you want : ");
        m = sc.nextInt();

        System.out.print("Input size of Array : ");
        n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Input array Elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        arraySorter(A);

        for (int i : A)
            System.out.print(i+", ");
        System.out.println();

        int i = 0;
        while (i < n){
            count++;
            while (i < n-1 && A[i+1] == A[i]){
                i++;
            }
            i++;
        }
        if(count >= m)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
