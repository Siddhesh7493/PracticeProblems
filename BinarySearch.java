import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many Elements you want to store in array:");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter elements in the Array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Key to Find Element:");
        int key = sc.nextInt();

        Arrays.sort(arr);

        int index = binarySearch(arr, key);

        if(index != -1){
            System.out.println("Found!! at index: " + index);
        } else {
            System.out.println("Not Found!!");
        }
    }

    static int binarySearch(int arr[], int key){
        int low = 0, high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == key)
                return mid;

            else if(arr[mid] < key)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }
}