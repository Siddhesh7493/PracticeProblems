import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many Elements you want to store in array:");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter elements in the Array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] originalarr=arr.clone();
        System.out.println("Before Sort :" + Arrays.toString(originalarr));
        selectionSort(arr);
        System.out.println("After Sort :" + Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){
        int n = arr.length;;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
