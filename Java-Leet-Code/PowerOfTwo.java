import java.util.Scanner;
import java.util.Arrays;

class PowerOfTwo{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Number >> ");
        n = sc.nextInt();

        System.out.println("Method 1 >> " + isPowerOfTwo_Method2(n));
        System.out.println("Method 2 >> " + isPowerOfTwo_Method1(n));
    }
    static boolean isPowerOfTwo_Method1(int n){
        int[] powArray = new int[31];
        powArray[0] = 1;
        for(int i = 1; i < 31; i++){
            powArray[i] = powArray[i-1] + powArray[i-1];
        }

        if(Arrays.binarySearch(powArray, n) < 0)
            return false;
        else
            return true;
    }
    static boolean isPowerOfTwo_Method2(int n){
        return n < 1 ? false : (n & n - 1) == 0 ? true : false;
    }
}