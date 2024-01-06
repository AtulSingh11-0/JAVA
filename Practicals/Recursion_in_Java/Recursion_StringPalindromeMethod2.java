import java.util.Scanner;
public class Recursion_StringPalindromeMethod2 {
    static boolean isPalindrome(String s1, int l, int r){
        // Base case
        if(l >= r) return true;
        // Recursive work
        return (s1.charAt(l) == s1.charAt(r) && isPalindrome(s1, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.print("Input a Word -> ");
        s1 = sc.nextLine();

        if(isPalindrome(s1, 0, s1.length()-1))
            System.out.println("It's a Palindrome String");
        else
            System.out.println("It's not a Palindrome String");
    }
}
