import java.util.Scanner;
public class Array_Pair_Equals_Sum {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, search, pair = 1;
        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];
        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.print("Array_1 : ");
        printArray(A);

        System.out.print("Input the Target_Sum : ");
        search = sc.nextInt();

        for(i = 0; i < n; i++){
            for(j = i+1; j < n; j++){
                if( (A[i] + A[j]) == search ){
                    System.out.println("Pair "+ pair + " : [" + A[i] + ", " + A[j] + "]");
                    ++pair;
                }
            }
        }
    }
}
