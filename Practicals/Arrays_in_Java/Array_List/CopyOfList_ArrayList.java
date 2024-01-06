import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CopyOfList_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<>();
        ArrayList<String> chr = new ArrayList<>();
        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" Integer_List Elements >> ");
        for (int i = 0; i < n; i++)
            num.add(sc.next());
        System.out.print("Input "+n+" Character_List Elements >> ");
        for (int i = 0; i < n; i++)
            chr.add(sc.next());
        System.out.println(" * List Elements before copying ");
        System.out.println("Integer_List elements are >> "+num);
        System.out.println("Character_List elements are >> "+chr);

        Collections.copy(num, chr);
        System.out.println(" * List Elements after copying ");
        System.out.println("Integer_List elements are >> "+num);
        System.out.println("Character_List elements are >> "+chr);
    }
}
