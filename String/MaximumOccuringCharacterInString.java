package String;
import java.util.*;

public class MaximumOccuringCharacterInString {
    public static char maxOccur(String s)
    {
        HashMap<Character,Integer>map = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        char result = ' ';
        for(int i = 0 ; i<s.length() ; i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>entry : map.entrySet())
        {
            char key = entry.getKey();
            int value = entry.getValue();
            if(value>maxFreq)
            {
                maxFreq = value;
                result = key;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The Maximu occuring character in the given string is "+maxOccur(s));
        sc.close();
    }
    
}
