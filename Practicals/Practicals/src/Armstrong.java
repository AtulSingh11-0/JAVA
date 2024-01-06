import java.util.Scanner;

public class Armstrong {
  int num;
  Armstrong(int num) {
    this.num = num;
  }
  public boolean calculate() {
    double res = 0;
    int temp = num;

    // calculating the number of digits
    int len = digits();

    // logic for checking if the number is Armstrong or not
    while(num != 0) {
      int rem = num % 10;
      res += Math.pow(rem, len);
      num /= 10;
    }
    return (temp == res);
  }

  // function to return the number of digits
  public int digits() {
    return String.valueOf(num).length();
  }
}

class Caller {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a Number >> ");
    int num = sc.nextInt();

    Armstrong arm = new Armstrong(num);
    System.out.println(arm.calculate());
  }
}