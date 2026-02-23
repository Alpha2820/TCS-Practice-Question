package Arrays;
import java.util.*;

public class ReverseAGivenArray {
    public static void reverseArray(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        while(left<=right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Original Array is ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The Reversed Array is ");
        reverseArray(arr);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
