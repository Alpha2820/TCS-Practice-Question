package Sorting;
import java.util.*;

public class SelectionSort {
    public static void sortArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++)
        {
            int minIndex = i;
            for(int j = i+1 ; j<n ; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array before sorting is ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Array after sorting is ");
        sortArray(arr);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
