import java.util.Scanner;
public class Recursion_LCM {
        static int multiple = 0;
    static int LCM(int n1, int n2){
        multiple += n2;
        if(multiple % n1 == 0 && multiple % n2 == 0)
            return multiple;
        else
            return LCM(n1, n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, lcm;
        System.out.println("Input 2 numbers :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 > num2)
            lcm = LCM(num1, num2);
        else
            lcm = LCM(num2, num1);
        System.out.print("LCM of "+num1+" and "+num2+" is -> "+lcm);
    }
}
