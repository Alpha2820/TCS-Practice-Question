package Arrays;

import java.util.Scanner;

public class LargestNumberInArray {
    public static int largestNumber(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array");
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest number in an array is "+ largestNumber(arr));
        sc.close();
    }
    
}
