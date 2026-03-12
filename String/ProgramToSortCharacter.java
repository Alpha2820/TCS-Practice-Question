package String;
import java.util.*;
public class ProgramToSortCharacter {
    public static ArrayList<Character> sortChar(String s)
    {
        ArrayList<Character> result = new ArrayList<>();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0 ; i<ch.length ; i++)
        {
            result.add(ch[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The Character of the String after Sorting is "+ sortChar(s));
        sc.close();
    }
    
}
