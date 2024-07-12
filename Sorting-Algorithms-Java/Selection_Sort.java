import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    static void selectionSort(int[] a, int n){
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[min])
                    min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
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
        selectionSort(a, n);
        System.out.print("Sorted Array >> " + Arrays.toString(a));
    }
}
