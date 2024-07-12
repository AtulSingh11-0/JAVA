import java.util.Scanner;
public class Recursion_FrogJump {
    static int bestJump(int[] h, int n, int idx){
        // Base case 1
        if(idx == n-1) return 0;
        int opt1 = bestJump(h, n, idx+1) + Math.abs(h[idx] - h[idx+1]);
        // Base case 2
        if(idx == n-2) return opt1;
        int opt2 = bestJump(h, n, idx+2) + Math.abs(h[idx] - h[idx+2]);
        return Math.min(opt1, opt2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of Array >> ");
        int n = sc.nextInt();
        int[] h = new int[n];
        System.out.print("Input " + n + " Array Elements >> ");
        for(int i = 0; i < n; i++)
            h[i] = sc.nextInt();
        System.out.println("Best Minimum cost incurred >> " + bestJump(h, n, 0));
    }
}
