import java.util.ArrayList;
public class Array_List_Reverse_Method_1 {
    static void reverseArrayList(ArrayList<Integer> list){
        int start = 0, end = list.size() - 1;
        while (start < end){
            Integer temp = Integer.valueOf(list.get(start));
            list.set(start++ , list.get(end));
            list.set(end-- , temp);
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.println("Original list -> " + l1);
        reverseArrayList(l1);
        System.out.println("Reversed List -> " + l1);
    }
}
