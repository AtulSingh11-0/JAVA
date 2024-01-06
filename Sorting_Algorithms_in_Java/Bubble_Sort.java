import java.util.Arrays;
import java.util.Scanner;
public class Bubble_Sort {
    static void bubbleSort(int[] a, int n){
        boolean swapped;
        for(int i = 0; i < n-1; i++){
            swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
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
        bubbleSort(a, n);
        System.out.print("Sorted Array >> " + Arrays.toString(a));
    }
}