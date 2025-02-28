package Algorithms.Searching;

import java.util.Scanner;
public class SearchAnElementInGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = SOLUTION.Search(arr, target);
        System.out.println(ans);
    }
}

class SOLUTION{
    static int Search(int arr[], int target) {
        int pivot = findPivot(arr);

        // Binary search on the first half (left of pivot)
        int result = binarySearch(arr, 0, pivot - 1, target);
        if (result != -1) return result;

        // Binary search on the second half (right of pivot)
        return binarySearch(arr, pivot, arr.length - 1, target);
    }

    static int findPivot(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low; // Pivot index where the smallest element is found
    }

    static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

