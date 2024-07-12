import java.util.Scanner;
public class Array_Element_Last_Occurrence {
    static void printArray(int[] arr){
        for( int i: arr)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,Index,Element;
        Index = -1;
        System.out.print("Input Array size : ");
        n = sc.nextInt();
        int[] A = new int[n];

        System.out.print("Input "+n+" Array elements : ");
        for(i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.print("Input Element to find its Last_Occurrence : ");
        Element = sc.nextInt();

        System.out.print("Array_1 : ");
        printArray(A);

        for(i = 0; i < n; i++){
            if(Element == A[i])
                Index = i;
        }
        System.out.println(Element+" last found at : "+Index+" index position");
    }
}
