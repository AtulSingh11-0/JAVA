import java.util.Scanner;
public class Recursion_removeAllOccurrences_StringMethod2 {
    static String occurrenceRemover(String s1, char target) {
        // base case
        if (s1.length() == 0)
            return "";
        // recursive work
        String ans = occurrenceRemover(s1.substring(1), target);
        char currChar = s1.charAt(0);
        // self work
        if (currChar != target)
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
        System.out.print("Updated String -> " + occurrenceRemover(s1, target));
    }
}
