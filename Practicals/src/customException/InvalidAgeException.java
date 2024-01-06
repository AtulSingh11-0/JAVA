package customException;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
  InvalidAgeException(String msg) {
    super(msg);
  }
}

class Voter {
  public static void isEligible(int age) throws InvalidAgeException {
    if(age > 21) {
      System.out.println("Eligible to Marry");
    } else {
      throw new InvalidAgeException("Your Age is too low");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Input your Age > ");
      int age = sc.nextInt();
      isEligible(age);
    } catch (InvalidAgeException ex) {
      System.out.println("Exception caught");
      System.out.println("Occurred Exception > " + ex);
    }
  }
}