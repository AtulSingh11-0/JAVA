import java.util.Scanner;

public class Fibonnaci {
  public long fibo(int n) {
    if(n < 2)
      return n;
    return fibo(n-1) + fibo(n-2);
  }
}

class PrintFibonnaci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the limit to the Sequence >> ");
    int limit = sc.nextInt();

    Fibonnaci obj = new Fibonnaci();
    int n = 0;
    System.out.print(n);
    while(n++ <= limit){
      System.out.print(", " + obj.fibo(n));
    }
  }
}