//import java.util.Arrays;
//import java.util.Scanner;
//public class Quick_Sort {
//    public static int partition(int[] a, int low, int high){
//        int pivot = a[high];
//
//    }
//    public static void quickSort(int[] a, int low, int high){
//        if(low < high)
//            int pivot_IDX = partition(a, low, high);
//        quickSort(a, low, pivot_IDX-1);
//        quickSort(a, pivot_IDX+1, high);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input size of Array >> ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        System.out.print("Input "+n+" Array elements >> ");
//        for(int i = 0; i < n; i++)
//            a[i] = sc.nextInt();
//        quickSort(a, 0, n-1);
//        System.out.print("Sorted Array >> "+ Arrays.toString(a));
//    }
//}
