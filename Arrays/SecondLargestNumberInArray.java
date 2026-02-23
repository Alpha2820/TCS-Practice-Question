package Arrays;
import java.util.*;

public class SecondLargestNumberInArray {
    public static int secondLargest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int secLarge =  Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]>secLarge && arr[i]!=largest)
            {
                secLarge = arr[i];
            }
        }
        return secLarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element in the Array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Second Largest Number in an Array is "+ secondLargest(arr));
        sc.close();
    }
}
