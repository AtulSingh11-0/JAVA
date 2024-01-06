import java.util.Scanner;
public class Recursion_printSubSequences {
    static void printSSQ(String input, String currAns){
        // Base case
        if(input.length() == 0){
            System.out.println(currAns);
            return;
        }
        // Recursive work
        char currChar = input.charAt(0);
        String remString = input.substring(1);
        // Self work
        printSSQ(remString, currAns + currChar); // currChar chooses to be the part of currAns
        printSSQ(remString, currAns); // currChar doesn't choose to be the part of currAns
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String -> ");
        String input = sc.next();

        printSSQ(input, "");
    }
}