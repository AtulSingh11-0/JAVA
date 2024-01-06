import java.util.Scanner;
public class Recursion_removeAllOccurrences_StringMethod1 {
    static String occurrenceRemover(String s1, int idx, char target) {
        // base case
        if (idx == s1.length())
            return "";
        // recursive work
        String ans = occurrenceRemover(s1, idx + 1, target);
        char currChar = s1.charAt(idx);
        // self work
        if (s1.charAt(idx) != target)
            return currChar + ans;
        else
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        char target;
        System.out.print("Input a Word -> ");
        s1 = sc.nextLine();
        System.out.print("Input the Character you want to remove the Occurrence of -> ");
        target = sc.next().charAt(0);
        System.out.print("Updated String -> " + occurrenceRemover(s1, 0, target));
    }
}
