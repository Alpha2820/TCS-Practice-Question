package String;

import java.util.*;

public class ASCIIValueOfCharacter {

    public static int value(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character whose ASCII Value you have to find");
        String s = sc.next();
        char ch = s.charAt(0);
        System.out.println("The ASCII value of the given character is " + value(ch));
        sc.close();
    }

}
