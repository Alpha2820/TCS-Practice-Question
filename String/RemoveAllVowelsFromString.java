package String;

import java.util.*;

public class RemoveAllVowelsFromString {
    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("The String before removing of all vowels is " + s);
        System.out.println("The String after removing all vowels is " + removeVowels(s));
        sc.close();
    }

}
