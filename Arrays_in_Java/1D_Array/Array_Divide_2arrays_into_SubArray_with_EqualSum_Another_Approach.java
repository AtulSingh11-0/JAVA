import java.util.Scanner;
public class Array_Divide_2arrays_into_SubArray_with_EqualSum_Another_Approach {
    static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    //method to calculate the totalSum of the array and return it
    static int ArraySummer(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    //method to check whether the sum of the prefix array Equals to the suffixSum of the array
    static int equalSumPartition(int[] arr){
        int n = arr.length, prefixSum = 0;
        int totalSum = ArraySummer(arr);
        for(int i = 0; i < n; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum ){
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

        /*
        * declaring a variable index to store the index position where the sum of both the prefix and suffix sum of
        * the array is equal
        * */
        int index = equalSumPartition(A);

        i = 0;
        if(index != -1) {
            //Printing sub_Array_1
            System.out.print("Sub_Array 1 : ");

            do {
                System.out.print(A[i] + " ");
                ++i;
            }while (i != index);

            //Printing sub_Array_2
            System.out.print("\nSub_Array 2 : ");

            while (i < n){
                System.out.print(A[i] + " ");
                i++;
            }
        } else System.out.println("False");//will print false if the index returned is == -1
    }
}
