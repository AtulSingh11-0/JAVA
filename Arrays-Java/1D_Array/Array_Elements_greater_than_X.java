import java.util.Scanner;
public class Array_Elements_greater_than_X {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,Greater,Element;
        Greater = 0;
        System.out.print("Input Array size : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input "+n+" Array elements : ");
        for(i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.print("Input Element to find how many Elements are Greater than it : ");
        Element = sc.nextInt();

        System.out.print("Array_1 : ");
        printArray(A);

        for(i = 0; i < n; i++){
            if(Element < A[i])
                ++Greater;
        }
        System.out.println("Array_Elements greater than "+Element+" are : "+Greater);
    }
}
