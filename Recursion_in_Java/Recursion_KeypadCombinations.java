import java.util.Scanner;
public class Recursion_KeypadCombinations {
    static void Combinations(String[] keypad, String digit, String result){
        if(digit.length() == 0){
            System.out.print(result + " ");
            return;
        }
        int currNum = digit.charAt(0) - '0';
        String currChoices = keypad[currNum];
        for(int i = 0; i < currChoices.length(); i++){
            Combinations(keypad, digit.substring(1), result + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the String >> ");
        String s = sc.next();
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        System.out.print("Keypad Combinations for the following String are >> ");
        Combinations(keypad, s, "");
    }
}
