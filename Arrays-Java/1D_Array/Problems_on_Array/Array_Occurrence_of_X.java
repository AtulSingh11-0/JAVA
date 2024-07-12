import java.util.Scanner;
public class Array_Occurrence_of_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, count = 0;
        System.out.print("Input size of the Array -> ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements -> ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input the number you want to find the Occurrence of -> ");
        x = sc.nextInt();

        for (int i = 0; i < n; i++){
            if (A[i] == x)
                count++;
        }
        System.out.println(x + " found " + count + " times");
    }
}
