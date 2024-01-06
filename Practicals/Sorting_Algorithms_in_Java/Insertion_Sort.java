import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    static void insertionSort(int[] a, int n) {
        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && a[j] < a[j-1]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of the Array >> ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input " + n + " Array Elements >> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        insertionSort(a, n);
        System.out.print("Sorted Array >> " + Arrays.toString(a));
    }
}
