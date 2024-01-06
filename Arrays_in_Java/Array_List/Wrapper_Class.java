import static java.lang.Integer.valueOf;
import static java.lang.Float.valueOf;
public class Wrapper_Class {
    public static void main(String[] args) {

        /*
        * Integer i = new Integer(3);
        * the above line is the depreciated form of calling a Wrapper_Class object
        *
        *
        * Integer n = Integer.valueOf(5);
        * the above line is the depreciated new form of creating/assigning values to a Wrapper_Class object
        *
        * */

        /*
        * There are 2 ways of creating a wrapper class object by the new method :
        *
        * 1. <wrapper class>.valueOf();
        *    Integer n = Integer.valueOf(5);
        *    Float f = Float.valueOf(3.14f);
        *
        * 2. using only valueOf();
        *    Integer n = valueOf(5);
        *    Float f = valueOf(3.14f);
        *
        * */

        Integer i = Integer.valueOf(5);
        Float f = Float.valueOf(3.14f);

        Integer iO = valueOf(10);
        Float fO = valueOf(6.28f);

        // printing the values
        System.out.println("Value of Integer i : " + i);
        System.out.println("Value of Float f : " + f);
        System.out.println("Value of Integer iO : " + iO);
        System.out.println("Value of Float fO : " + fO);
    }
}
