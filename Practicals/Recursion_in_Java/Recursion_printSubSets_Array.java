import java.util.Scanner;
public class Recursion_printSubSets_Array {
    static void printSubSets(int[] A, int idx, int len, int sum){
        if(idx >= len){
            System.out.println(sum);
            return;
        }
        printSubSets(A, idx+1, len, sum + A[idx]);
        printSubSets(A, idx+1, len, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input size of Array -> ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Input "+ n +" Array Elements -> ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        printSubSets(a, 0, a.length, 0);
    }
}