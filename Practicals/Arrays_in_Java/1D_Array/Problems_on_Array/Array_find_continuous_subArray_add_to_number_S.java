import java.util.Scanner;
public class Array_find_continuous_subArray_add_to_number_S {
    static void printArray(int[] A){
        for(int i : A)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s, sum = 0;
        System.out.print("Input size of Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];

        //taking input of Array elements
        System.out.print("Input " +n+ " elements for Array : ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input the Sum -> ");
        s = sc.nextInt();

        printArray(A);
        int i = 0;
        int j = 0;
        while(j < n){
            sum += A[j];
            if(sum > s){
                while(sum > s && i < j){
                    sum -= A[i];
                    i++;
                }
            }
            if(sum == s){
                System.out.print(i + " ");
                System.out.print(j);
                break;
            }
            j++;
        }
    }
}