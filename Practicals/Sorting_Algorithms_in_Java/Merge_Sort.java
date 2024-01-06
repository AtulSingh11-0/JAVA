import java.util.Arrays;
import java.util.Scanner;
public class Merge_Sort {
    static int[] mergeSort(int[] a) {
        if(a.length == 1) return a;
        int mid = a.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] sec) {
        int[] mix = new int[first.length + sec.length];
        int i, j, k;
        i = j = k = 0;

        while (i < first.length && j < sec.length) {
            if (first[i] < sec[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = sec[j];
                j++;
            }
            k++;
        }

        // suppose if any of the arrays have become empty
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < sec.length) {
            mix[k] = sec[j];
            j++;
            k++;
        }

        return mix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of Array >> ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input "+n+" Array elements >> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int[] ans = mergeSort(a);
        System.out.print("Sorted Array >> "+Arrays.toString(ans));
    }
}
