package Arrays;
import java.util.*;
public class CountFrequencyofEachElementInArray {
    public static HashMap<Integer,Integer> frequencyMap(int arr[])
    {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Array Elements");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The frequency of each element in Java is "+ frequencyMap(arr));
        sc.close();
    }
}
