package Numbers;
import java.util.*;

public class GreatestOfThreeNumber {
    public static int greatThree(int a , int b , int c)
    {
        return Math.max(Math.max(a,b),c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number");
        int num3 = sc.nextInt();
        System.out.println("The Greatest of three numbers are "+greatThree(num1,num2,num3));
        sc.close();
    }
    
}
