import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Declaring the scanner class object
        * and passing the standard input object to it
        * */
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your name >> ");
        String name = sc.nextLine(); // string input
        System.out.print("Input your age >> ");
        int age = sc.nextInt(); // integer input
        System.out.print("Input your mobile number >> ");
        long mobile = sc.nextLong(); // long input
        System.out.print("Input your CGPA >> ");
        double cgpa = sc.nextDouble(); // double input

        // printing the details
        System.out.println("\n\nEntered Details : ");
        System.out.println("Name >> " + name);
        System.out.println("Age >> " + age);
        System.out.println("Mobile Number >> " + mobile);
        System.out.println("CGPA >> " + cgpa);
    }
}