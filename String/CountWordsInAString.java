package String;
import java.util.*;

public class CountWordsInAString {
    public static int countWords(String s)
    {
        s = s.trim();
        String str[] = s.split("\\s+");
        return str.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The number of words in a String is "+countWords(s));
        sc.close();
    }  
}
