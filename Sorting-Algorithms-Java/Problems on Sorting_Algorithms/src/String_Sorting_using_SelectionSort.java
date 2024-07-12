import java.util.Arrays;
import java.util.Scanner;
public class String_Sorting_using_SelectionSort {
    static void selectionSort(String[] a, int n) {
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++) {
                if(a[j].compareTo(a[min]) < 0)
                    min = j;
            }
            String temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of Array >> ");
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.print("Input "+n+" Array Elements >> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.next();
        selectionSort(a, n);
        System.out.print("Sorted String in Lexicographical manner >> "+Arrays.toString(a));
    }
}
