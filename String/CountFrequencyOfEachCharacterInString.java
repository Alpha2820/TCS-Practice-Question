package String;
import java.util.*;

public class CountFrequencyOfEachCharacterInString {
    public static Map<Character,Integer> count(String s)
    {
        Map<Character,Integer>result = new HashMap<>();
        for(int i = 0 ; i<s.length() ; i++)
        {
            result.put(s.charAt(i),result.getOrDefault(s.charAt(i),0)+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The Frequency of each Character in a String is");
        System.out.println(count(s));
        sc.close();
    }
}
