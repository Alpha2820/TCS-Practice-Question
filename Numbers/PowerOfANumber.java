package Numbers;
import java.util.*;

public class PowerOfANumber {
    public static int Calc(int base , int power)
    {
        return (int)Math.pow(base,power);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        int base = sc.nextInt();
        System.out.println("Enter the Power");
        int power = sc.nextInt();
        System.out.println("The result of "+base+" raised to the power "+power+" is "+Calc(base, power));
        sc.close();
    }
    
}
