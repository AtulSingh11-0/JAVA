import java.util.ArrayList;
import java.util.Scanner;
public class Recursion_LinearSearch_ArrayList {
    static ArrayList<Integer> allIndices(int[] A, int n, int len, int search){
        ArrayList<Integer> ans = new ArrayList<>();
        // base case
        if(n >= len) {
            return ans;
        }
        // self work
        if(A[n] == search)
            ans.add(n);
        // recursive work
        ArrayList<Integer> smallAns = allIndices(A, n + 1, len, search);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.print("Input size of the array -> ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input Array elements -> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Input the Number you want to search -> ");
        x = sc.nextInt();
        ArrayList<Integer> ans = allIndices(a, 0, n, x);
        for(Integer i : ans)
            System.out.format("%2d", i);
    }
}