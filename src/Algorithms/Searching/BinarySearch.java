package Algorithms.Searching;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = bs(arr, t);
        System.out.println(ans);
    }
    public static int bs(int[] arr,int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid]==n) return mid;
            else if(arr[mid]>n) right = mid - 1;
            else if(arr[mid]<n) left = mid + 1;
        }
        return -1;
    }
}