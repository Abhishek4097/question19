import java.util.Scanner;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] Arr, int start, int end, int find) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (Arr[mid] == find) {
            return mid;
        }
        if (find < Arr[mid]) {
            return binarySearch(Arr, start, mid - 1, find);
        }
        return binarySearch(Arr, mid + 1, end, find);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter the " + n +" elements of array : ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no to be found : ");
        int find = sc.nextInt();
        int index = binarySearch(Arr, 0, n - 1, find);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("The element " + find + " was found at " + index + "th position in the array");
        }
        sc.close();
    }
}
