import java.util.ArrayList;
import java.util.Collections;
public class Array_List_DescendingSort_String_List_using_CollectionsSort_Method {
    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Atul");
        l1.add("Messi");
        l1.add("Simms");
        l1.add("Suuuuiiiiiii");
        l1.add("G.O.A.T.");
        l1.add("Kylian");
        System.out.println("Original list -> " + l1);
        l1.sort(Collections.reverseOrder());
        System.out.println("Sorted List -> " + l1);
    }
}
