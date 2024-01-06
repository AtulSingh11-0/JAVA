import java.util.Scanner;

public class Factorial {
  public long fact(int num) {
    if(num < 2)
      return 1;
    return num * fact(num - 1);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Factorial obj1 = new Factorial();
    Factorial obj2 = new Factorial();

    // taking 2 numbers as user input
    System.out.print("Input Number 1 >> ");
    int num1 = sc.nextInt();
    System.out.print("Input Number 2 >> ");
    int num2 = sc.nextInt();

    // storing the result of those numbers withing a vairable
    long result1 = obj1.fact(num1);
    long result2 = obj2.fact(num2);

    // you can also directly print the result instead of storing it in a variable
    System.out.println("Factorial of "+num1+" is >> "+result1);
    System.out.println("Factorial of "+num2+" is >> "+result2);
  }
}