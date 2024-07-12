import java.util.Arrays;
import java.util.Scanner;
public class Move_Zeroes {
    static void bubbleSort(int[] a, int n) {
        boolean swap;
        for(int i = 0; i < n-1; i++){
            swap = false;
            for(int j = 0; j < n-i-1; j++){
                if(a[j] == 0 && a[j+1] != 0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)   break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of Array >> ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input "+n+" Array Elements >> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        bubbleSort(a, n);
        System.out.println(Arrays.toString(a));
    }
}
