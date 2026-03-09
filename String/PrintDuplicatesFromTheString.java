package String;

import java.util.*;

public class PrintDuplicatesFromTheString {
    public static String printDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If we've seen it before AND haven't already added it to duplicates
            if (seen.contains(ch) && !duplicates.contains(ch)) {
                sb.append(ch);
                duplicates.add(ch); // Mark it so we don't append it again
            } else {
                seen.add(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("THe String before printing only duplicates is " + s);
        System.out.println("The result string which contains only duplicates " + printDuplicates(s));
        sc.close();
    }
}
