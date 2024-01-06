import java.util.Arrays;
import java.util.Collections;
public class Array_print_Min_element_using_Library {
    public static void main(String[] args) {
        Integer[] arr = {2, -3, 5, 8, 1, 0, -4};
        int min = Collections.min(Arrays.asList(arr));
        System.out.print("Min element in the Array -> "+ min);
    }
}
