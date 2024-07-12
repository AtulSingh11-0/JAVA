import java.util.ArrayList;
import java.util.Scanner;

public class Clone_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" List_1 Elements >> ");
        for (int i = 0; i < n; i++)
            list1.add(sc.nextInt());
        System.out.println("List_1 Elements are >> "+list1);

        ArrayList<Integer> list2 = (ArrayList<Integer>)list1.clone();
        System.out.println("Cloned List_1 Elements are >> "+list2);
    }
}
