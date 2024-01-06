import java.util.Scanner;
public class Recursion_A_to_the_Power_B {
    static int pow(int base, int power){
        if(power == 0)
            return 1;
        else
            return base * pow(base, power-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, power;
        System.out.print("Input the Base : ");
        base = sc.nextInt();
        System.out.print("Input the Power : ");
        power = sc.nextInt();
        System.out.println(base + " raised to the power "+power+" is -> " + pow(base, power));
    }
}
