import java.util.Scanner;
public class Recursion_reverseAString {
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
        String s1;
        System.out.print("Input a Word -> ");
        s1 = sc.nextLine();
        System.out.print("Reversed String -> " + reverse(s1, 0));
    }
}
