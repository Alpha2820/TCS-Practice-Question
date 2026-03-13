package String;

import java.util.*;

public class ReverseWordsInAString {
    public static String reverse(String s) {
        s = s.trim();
        String str[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = str.length - 1;
        while (left <= right) {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            if (i < str.length - 1) { // Only add space if it's NOT the last word
                sb.append(" ");
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The words before getting reversed in the String are " + s);
        System.out.println("The words after getting reversed in the String are " + reverse(s));
        sc.close();
    }

}
