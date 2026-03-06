package String;
import java.util.*;

public class CountCommonSubSequence {
    public static int countCommon(String s1 , String s2)
    {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i = 1 ; i<s1.length() ; i++)
        {
            for(int j = 1; j<s2.length() ; j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                 dp[i][j] = 1 + dp[i-1][j-1];   
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fisrt String");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String");
        String s2 = sc.nextLine();
        System.out.println("The common sub-sequence in two strings are "+countCommon(s1,s2));
        sc.close();
    }
    
}
