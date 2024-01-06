import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" list Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.print("Input the index of Element you want to remove >> ");
        int idx = sc.nextInt();
        System.out.println("List elements are >> "+list);
        list.remove(idx);
        System.out.println("List after removing the desired element >> "+list);
    }
}
