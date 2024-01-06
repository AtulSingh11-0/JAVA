import java.util.ArrayList;
public class Array_List_Creation_and_Methods {
    public static void main(String[] args) {

        /*
        * ArrayList of different WrapperClass types
        *
        * ArrayList<Integer> list_1 = new ArrayList<>();
        * ArrayList<Long> list_2 = new ArrayList<>();
        * ArrayList<Float> list_3 = new ArrayList<>();
        * ArrayList<Double> list_4 = new ArrayList<>();
        * ArrayList<Boolean> list_5 = new ArrayList<>();
        *
        * */

        ArrayList<Integer> l1 = new ArrayList<>();

        //add elements
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        //get an element at index i
        System.out.println("* Accessing Element at Index_1 -> " + l1.get(1));//prints the element at 1st index i.e. 2

        //print using loops
        System.out.print("* ArrayList Elements <for-loop>: ");
        for (int i = 0; i < l1.size(); i++)
            System.out.print(l1.get(i) + " ");

        System.out.print("\n* ArrayList Elements <for-each loop> : ");
        for (int i : l1 )
            System.out.print(i + " ");
        System.out.println();

        //printing the ArrayList directly
        System.out.println("* Printing ArrayList Elements directly -> " + l1);// [1, 2, 3, 4, 5]

        //adding elements at some index i
        l1.add(2,6);
        System.out.println("* Updated ArrayList -> " + l1);// [1, 2, 6, 3, 4, 5]

        //modifying elements at index i
        l1.set(1, 200);
        System.out.println("* Modified ArrayList -> " + l1);// [1, 200, 6, 3, 4, 5]

        //removing an element at index i
        l1.remove(2);
        System.out.println("* Removed ArrayList_1 -> " + l1);// [1, 200, 3, 4, 5]

        //removing an element e
        System.out.println(l1.remove(Integer.valueOf(200)));
        System.out.println(l1.remove(Integer.valueOf(1000)));
        System.out.println("* Removed ArrayList_2 -> " + l1);// [1, 3, 4, 5]
        /*
        * if we are passing a value here: l1.remove(Integer.valueOf(100));
        * which doesn't exist then it will not make any changes to the ArrayList
        *
        * and if we try to print it this method will return a boolean value
        * like if the method exists and is removed, it will then print true or else false if it is not present
        * */

        //checking if an element exists
        boolean ans1 = l1.contains(Integer.valueOf(5));
        boolean ans2 = l1.contains(Integer.valueOf(50));
        System.out.println("Is " + Integer.valueOf(5) + " Present in this ArrayList -> " + ans1);
        System.out.println("Is " + Integer.valueOf(50) + " Present in this ArrayList -> " + ans2);

        //if you don't specify and WrapperClass, you can assign anything inside l1
        ArrayList l = new ArrayList();
        l.add("Messi");
        l.add(true);
        l.add('X');
        l.add(45);
        l.add(3.14f);
        l.add(5.45);
        System.out.println("\n* UnSpecified ArrayList -> " + l);
    }
}