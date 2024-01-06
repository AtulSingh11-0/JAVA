import java.util.Scanner;
public class Recursion_A_to_the_Power_B_better_Approach {
    static int pow(int base, int power){
        if(power == 0)
            return 1;
        int smallPower = pow(base, power / 2);
        //if power is even
        if(power % 2 == 0)
            return smallPower * smallPower;

        //if power is odd
        return smallPower * smallPower * base;
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
