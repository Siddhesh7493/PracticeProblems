import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many Elements you want to store in array:");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter elements in the Array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int originalarr[] = arr.clone();
        bubbleSort(arr);
        System.out.println("Original Array:"+Arrays.toString(originalarr));
        System.out.println("Sorted Array:"+ Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]){
        int N = arr.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
