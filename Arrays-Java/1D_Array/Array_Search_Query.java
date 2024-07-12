import java.util.Scanner;
public class Array_Search_Query {
    static int[] frequency_of_Element(int[] arr){
        int[] freq = new int[1_00_005];
        for( int i : arr)
            freq[i]++;
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, query;

        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        int[] freq = frequency_of_Element(A);
        System.out.print("Input number of Queries : ");
        query = sc.nextInt();

        while ( query > 0){
            System.out.print("Input the number to search : ");
            int search = sc.nextInt();
            if(freq[search] > 0)
                System.out.print("Yes\n");
            else System.out.print("No\n");
            query--;
        }
    }
}