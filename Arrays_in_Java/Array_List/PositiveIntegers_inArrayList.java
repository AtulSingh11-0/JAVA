import java.util.ArrayList;
import java.util.Scanner;

public class PositiveIntegers_inArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many elements you want to insert >> ");
        int n = sc.nextInt();
        System.out.print("Input "+n+" list Elements >> ");
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        System.out.println("List elements are >> "+list);
        System.out.print("Positive Elements in the list are >> ");
        int c = 0;
        for(int i : list) {
            if(i >= 0) {
                System.out.print(i + " ");
                ++c;
            }
        }
        if(c == 0)  System.out.println("NA");
    }
}
