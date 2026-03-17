package Numbers;
import java.util.*;

public class EvenOrOdd {
    public static boolean checkNum(int n)
    {
        return n % 2 == 0 ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean check = checkNum(n);
        if(check)
        {
            System.out.println("The given number is an even number");
        }
        else
        {
            System.out.println("The given number is an odd number");
        }
        sc.close();
    }
    
}
