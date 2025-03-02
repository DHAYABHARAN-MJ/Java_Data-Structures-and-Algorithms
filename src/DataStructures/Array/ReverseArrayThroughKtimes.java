package DataStructures.Array;

import java.util.Scanner;
class reverseArrayThroughKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        reverse(arr,k);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr, int k){
        for(int i = 0;i<arr.length-k;i=i+k){
            int st = i;
            int end = i+k-1;
            while(st<end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
    }
}