import java.util.Scanner;

public class Linear_Search_newbie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, search, index = 0;
        System.out.print("Input size of the Array : ");
        n = sc.nextInt();
        int A[] = new int[n];

        System.out.println("Input Array Elements :");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input the Element you want to search : ");
        search = sc.nextInt();

        System.out.println("Array Elements are : ");
        for (i = 0; i < n; i++){
            System.out.println("A["+i+"] : "+A[i]);
            if(A[i] == search){
                index = i;
                break;
            }
            else
                index = -1;
        }
        System.out.println("index : "+index);
    }
}
