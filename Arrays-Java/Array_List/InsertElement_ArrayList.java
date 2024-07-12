import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" list Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.print("Input the Element you want to insert >> ");
        int ele = sc.nextInt();

        System.out.println("List before inserting the element >> "+list);
        list.add(0, ele);
        System.out.println("List after inserting the element >> "+list);
    }
}
