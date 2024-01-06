import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Extract_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" Integer_List Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.println("List Elements are >> "+list);
        System.out.print("Input the index positions for Extracting a portion >> ");
        int idx_1 = sc.nextInt();
        int idx_2 = sc.nextInt();

        ArrayList<Integer> subList = new ArrayList<>(list.subList(idx_1,  idx_2+1));
        System.out.println("Extracted SubList >> "+subList);
    }
}
