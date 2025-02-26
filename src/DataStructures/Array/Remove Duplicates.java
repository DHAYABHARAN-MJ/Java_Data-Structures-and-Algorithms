package DataStructures.Array;

import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int nr = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]){
                arr[nr++] = arr[i];
            }
        }
        for(int i =0; i<nr;i++){
            System.out.print(arr[i]+" ");
        }
    }
}