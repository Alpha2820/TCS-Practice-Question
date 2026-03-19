package Numbers;
import java.util.*;

public class ReverseDigitsOfANumber {
    public static void rev(int n)
    {
        while(n!=0)
        {
            int rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The number before reversing the digits is "+num);
        System.out.println("The number after reversing the digit");
        rev(num);
        sc.close();
    }
    
}
