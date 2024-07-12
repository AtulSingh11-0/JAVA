import java.util.Scanner;
public class Toggle_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                n += Character.toLowerCase(s.charAt(i));
            } else {
                n += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(n);
    }
}