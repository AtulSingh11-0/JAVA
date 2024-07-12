import java.util.Scanner;
public class Recursion_LinearSearch_Index {
    static int elementFinder(int[] A, int n, int len, int search){
        //base case
        if(A[n] == search)
            return n;
        else if(n == len-1) { // self work
            return -1;
        } else return elementFinder(A, n + 1, len, search); // recursive work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, ans;
        System.out.print("Input size of the array -> ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input Array elements -> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Input the Number you want to search -> ");
        x = sc.nextInt();
        ans = elementFinder(a, 0, n, x);

        if(ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " + ans + " Index Position");
    }
}
