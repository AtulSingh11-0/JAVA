import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swapTwoElements_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" list Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.print("Input the indices of Element you want to swap >> ");
        int IDX_1 = sc.nextInt();
        int IDX_2 = sc.nextInt();

        System.out.println("List elements are >> "+list);
        Collections.swap(list, IDX_1, IDX_2);
        System.out.println("List elements after performing swapping >> "+list);
    }
}
