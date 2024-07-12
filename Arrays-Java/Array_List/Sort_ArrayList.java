import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" list Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.println("List elements are >> "+list);
        Collections.sort(list);
        System.out.println("List elements after sorting >> "+list);
    }
}
