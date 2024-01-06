import java.util.Arrays;
import java.util.Scanner;
public class Merge_Sort_PW {
    static void mergeSort(int[] a, int l, int r) {
        if(l >=  r)  return;
        int mid = (l+r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid+1, r);
        merge(a, l, mid, r); 
    }
    static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] first = new int[n1];
        int[] sec = new int[n2];
        int i, j, k;
        for(i = 0; i < n1; i++) first[i] = a[l+i];
        for(j = 0; j < n2; j++) sec[j] = a[mid+1+j];

        i = j = 0; k = l;
        while(i < n1 && j < n2){
            if(first[i] < sec[j]){
                a[k++] = first[i++];
            } else {
                a[k++] = sec[j++];
            }
        }

        while(i < n1)   a[k++] = first[i++];
        while(j < n2)   a[k++] = sec[j++];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of Array >> ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input "+n+" Array Elements >> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        mergeSort(a, 0, n-1);
        System.out.print("Sorted Array >> "+ Arrays.toString(a));
    }
}
