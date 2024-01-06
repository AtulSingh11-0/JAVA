package customException;

import java.util.Scanner;

public class BiggerNumberException extends Exception{
  public BiggerNumberException(String msg) {
    super(msg);
  }
}

class Number {
  public static void isBigger(int num) throws BiggerNumberException {
    if(num < 200) {
      System.out.println("Number is good");
    } else {
      throw new BiggerNumberException("Number is bigger");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Input a Number > ");
      int num = sc.nextInt();
      isBigger(num);
    } catch (BiggerNumberException ex) {
      System.out.println("Caught an Exception");
      System.out.println(ex);
    }
  }
}