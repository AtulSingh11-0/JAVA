import java.util.ArrayList;
import java.util.Collections;
public class Array_List_Reverse_Method_2 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.println("Original list -> " + l1);
        Collections.reverse(l1);
        System.out.println("Reversed List -> " + l1);
    }
}
