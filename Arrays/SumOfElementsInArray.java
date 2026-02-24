package Arrays;
import java.util.*;

public class SumOfElementsInArray {
    public static int arraySum(int arr[])
    {
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++)
        {
            sum += arr[i];
        }
        return sum;
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
        System.out.println("The sum of Array elements is: "+arraySum(arr));
        sc.close();
    }
    
}
