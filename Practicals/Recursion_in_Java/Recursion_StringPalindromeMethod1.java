import java.util.Scanner;
public class Recursion_StringPalindromeMethod1 {
    static String reverse(String s1, int idx){
        // Base case
        if(idx == s1.length()) return "";
        // Recursive work
        String ans = reverse(s1, idx + 1);
        //self work
        return ans + s1.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, ans;
        System.out.print("Input a Word -> ");
        s1 = sc.nextLine();
        ans = reverse(s1, 0);

        if(s1.compareTo(ans) == 0)
            System.out.println("It's a Palindrome String");
        else
            System.out.println("It's not a Palindrome String");
    }
}
