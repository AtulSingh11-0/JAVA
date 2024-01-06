import java.util.Scanner;

public class Palindrome {
  private int num;
  Palindrome(int num) {
    this.num = num;
  }
  public boolean checkPalindrome(){
    int temp = num;
    int res = 0;

    // logic to reverse the number
    while(num != 0) {
      int rem = num % 10;
      res = res * 10 + rem;
      num /= 10;
    }
    // check if the number is Palindrome or not
    return temp == res;
  }
}

class PalCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a Number > ");
    int num = sc.nextInt();

    Palindrome obj = new Palindrome(num);
    System.out.println(obj.checkPalindrome());
  }
}