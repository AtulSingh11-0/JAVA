import java.util.ArrayList;
import java.util.Scanner;

public class JoinLists_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" List_1 Elements >> ");
        for (int i = 0; i < n; i++)
            list1.add(sc.nextInt());
        System.out.print("Input "+n+" List_2 Elements >> ");
        for (int i = 0; i < n; i++)
            list2.add(sc.nextInt());
        System.out.println("List_1 Elements are >> "+list1);
        System.out.println("List_2 Elements are >> "+list2);

        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("List_3 Elements are >> "+list3);
    }
}