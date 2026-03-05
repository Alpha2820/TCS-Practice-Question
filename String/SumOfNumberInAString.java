package String;

import java.util.*;

public class SumOfNumberInAString {
    public static int sum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
            sum += ch - '0';
        }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String containing number");
        String s = sc.nextLine();
        System.out.println("The sum of digits of a string containing number is " + sum(s));
        sc.close();
    }

}
