package Arrays;
import java.util.*;

public class RearrangeArrayInIncreasingOrder {
    public static void display(int arr[])
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int start , int end , int arr[])
    {
       while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void increaseDecreaseArray(int arr[])
    {
        Arrays.sort(arr);
        swap(arr.length/2, arr.length-1, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in an Array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array before is ");
        display(arr);
        System.out.println("The Array after the Increasing and Decreasing Order are ");
        increaseDecreaseArray(arr);
        display(arr);
        sc.close();
    }  
}
