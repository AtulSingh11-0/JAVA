import java.util.Scanner;
public class Recursion_HCF_GCD {
    static int HCF_GCD(int n1, int n2){
        if(n2 % n1 == 0)
            return n1;
        else
            return HCF_GCD(n2, n1 % n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Input 2 Numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("HCF or GCD of "+num1+" and "+num2+" is -> "+HCF_GCD(num1, num2));
    }
}
