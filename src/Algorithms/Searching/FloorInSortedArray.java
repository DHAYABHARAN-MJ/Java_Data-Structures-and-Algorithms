package Algorithms.Searching;

import java.util.*;
public class FloorInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        int ans = fisa(arr,k);
        System.out.println(ans);
    }
    public static int fisa(int[] arr, int k){
        int left = 0;
        int right = arr.length - 1;
        int floor = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid] < k){
                left = mid + 1;
                floor = mid;
            }
            else if(arr[mid] > k){
                right = mid - 1;
            }
        }
        return floor;
    }
}