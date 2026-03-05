package String;

import java.util.*;

public class NonRepeatingCharacterInString {
    public static ArrayList<Character> nrc(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                result.add(s.charAt(i));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The Non-repeating Characters of a String are ");
        System.out.println(nrc(s));
        sc.close();

    }

}
