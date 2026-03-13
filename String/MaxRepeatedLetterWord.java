package String;

import java.util.*;

public class MaxRepeatedLetterWord {
    public static String findWord(String s) {
        if (s == null || s.isEmpty())
            return "";

        String[] words = s.split("\\s+");
        String result = "";
        int maxRepeatGlobal = 0;

        for (String word : words) {
            int currentMax = getMaxRepeatInWord(word);

            // If this word has more repetitions than our previous champion
            if (currentMax > maxRepeatGlobal) {
                maxRepeatGlobal = currentMax;
                result = word;
            }
        }
        return result;
    }

    public static int getMaxRepeatInWord(String word) {
        Map<Character, Integer> counts = new HashMap<>();
        int max = 0;

        for (char ch : word.toLowerCase().toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
            max = Math.max(max, counts.get(ch));
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("Word with max repeats: " + findWord(s));
        sc.close();
    }
}
