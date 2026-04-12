import java.util.Scanner;

public class LinearSearch {
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

        boolean ans = linearSearchCheck(arr, key);

        if(ans){
            System.out.println("Finally Found!!");
        }else{
            System.out.println("Unfortunately!! Not Found");
        }
    }

    static boolean linearSearchCheck(int arr[], int key){
        int index = 0;

        for(int i : arr){
            if(i == key){
                System.out.println("Element found at index " + index);
                return true;
            }
            index++;
        }

        return false;
    }
}