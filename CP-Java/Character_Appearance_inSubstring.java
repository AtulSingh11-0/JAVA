import java.util.Scanner;
public class Character_Appearance_inSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) System.out.println(s.charAt(i) + " -> " + ((s.length() - i) * (i + 1)));
    }
}
