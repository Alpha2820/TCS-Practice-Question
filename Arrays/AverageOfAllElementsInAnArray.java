package Arrays;
import java.util.*;

public class AverageOfAllElementsInAnArray {
    public static double averageArray(int arr[])
    {
        double sum = 0.0 ;
        for(int i = 0 ; i<arr.length ; i++)
        {
            sum += (double)arr[i];
        }
        return sum/(double)arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the Array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The average of the elements in an array is: "+ averageArray(arr));
        sc.close();
    }
    
}
