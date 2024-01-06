import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" Integer_List Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.println("List Elements are >> "+list);
        ArrayList<Integer> list2 = new ArrayList<>(list);
        Collections.reverse(list);
        System.out.println("Reversing the Elements using Collections Framework >> "+list);

        int start = 0, end = list2.toArray().length-1;
        while(start < end) {
            int temp = list2.get(start);
            int temp2 = list2.get(end);
            list2.set(start++, temp2);
            list2.set(end--, temp);
        }
        System.out.println("Reversing the Elements using loop >> "+list2);
    }
}
