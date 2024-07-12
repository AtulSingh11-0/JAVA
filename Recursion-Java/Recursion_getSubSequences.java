import java.util.ArrayList;
import java.util.Scanner;
public class Recursion_getSubSequences {
    static ArrayList<String> getSSQ(String input){
        ArrayList<String> ans = new ArrayList<>();
        // Base case
        if(input.length() == 0){
            ans.add("");
            return ans;
        }
        // Recursive work
        ArrayList<String> smallAns = getSSQ(input.substring(1));
        char currChar = input.charAt(0);
        // Self work
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(currChar + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String -> ");
        String input = sc.next();

        ArrayList<String> ans = getSSQ(input);
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}
