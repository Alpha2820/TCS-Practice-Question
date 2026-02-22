package Arrays;
import java.util.*;

public class SmallestNumberInArray{
    public static int smallestNumber(int arr[])
    {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(smallest>arr[i])
            {
                smallest = arr[i];
            }            
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the Array");
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The smallest number in an array is " + smallestNumber(arr));
        sc.close();

        
    }

}