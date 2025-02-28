package Algorithms.Searching;

import java.util.Scanner;
class SearchMinimumInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = anw(arr);
        System.out.println(ans);
    }
    public static int anw(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if(arr[low]<arr[high]) {
                return arr[low];
            }
            if(arr[mid]>arr[high]){
                low = mid + 1;
            }
            if(arr[mid]<arr[low]){
                high = mid ;
            }
        }
        return arr[low];
    }
}