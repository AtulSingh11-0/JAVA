import java.util.Scanner;
public class No_Of_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println((s.length() * (s.length() + 1))/ 2);
    }
}
