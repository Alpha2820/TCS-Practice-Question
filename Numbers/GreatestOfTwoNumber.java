package Numbers;
import java.util.*;

public class GreatestOfTwoNumber {
    public static double greatest(double n1, double n2)
    {
        return n1>n2 ? n1 : n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        double n1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double n2 = sc.nextDouble();
        System.out.println("The Greatest of two numbers are "+ greatest(n1,n2));
        sc.close();
    }
    
}
