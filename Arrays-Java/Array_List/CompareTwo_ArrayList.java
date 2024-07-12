import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompareTwo_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<String> equals = new ArrayList<>();

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

        for(int i = 0; i < n; i++) {
            equals.add(list1.get(i).equals(list2.get(i)) ? "Yes" : "No");
        }
        System.out.println("Comparative List >> "+equals);
    }
}
