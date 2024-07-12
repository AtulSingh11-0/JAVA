import java.util.Scanner;
public class Array_Divide_2arrays_into_SubArray_with_EqualSum {
    //method to print the Array whenever called statically
    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    //method to calculate the prefix sum of the array and store it in a prefix Clone_Array
    static int[] prefixSummer(int[] arr){
        int[] prefixArray = arr.clone();
        for(int i = 1; i < arr.length; i++){
            prefixArray[i] += prefixArray[i-1];
        }
        return prefixArray;
    }
    //method to check whether the sum of the prefix array Equals to another part of the sub_Array and return the index
    static int sumArrayChecker(int[] prefix){
        int n = prefix.length;
        for(int i = 0; i < n; i++){
            int ans = prefix[n-1] - prefix[i];
            if(ans == prefix[i]){
                return ++i;
            }
        }
        return -1;
    }
    //main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i;

        //inputting the size of Array
        System.out.print("Input size of Array : ");
        n = sc.nextInt();
        int[] A = new int[n];//declaring array of size n

        //taking input of the Array_Elements
        System.out.print("Input " + n + " Array elements : ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();

        //Printing the Original array
        System.out.print("Original Array : ");
        printArray(A);

        //creating a prefix array so that we can pass it as a value to sumArrayChecker
        int[] prefix = prefixSummer(A);
        int index = sumArrayChecker(prefix);

        i = 0;
        if(index != -1) {
            //Printing the sub_Array_1
            System.out.print("Sub_Array 1 : ");

            do {
                System.out.print(A[i] + " ");
                ++i;
            }while (i != index);

            //Printing the sub_Array_2
            System.out.print("\nSub_Array 2 : ");

            while (i < n){
                System.out.print(A[i] + " ");
                i++;
            }
        } else System.out.println("False");//will print false if the index returned is == -1
    }
}
