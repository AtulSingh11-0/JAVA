import java.util.ArrayList;
import java.util.Scanner;

public class Empty_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" List_1 Elements >> ");
        for (int i = 0; i < n; i++)
            list1.add(sc.nextInt());
        System.out.println("List Elements are >> "+list1);
        list1.removeAll(list1);
        System.out.println("List Element after Emptying it >> "+list1);
    }
}
