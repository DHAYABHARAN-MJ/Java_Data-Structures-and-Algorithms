package DataStructures.Array;

import java.util.*;
public class GCDofArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        int res = gcd(arr,min);
        System.out.println(res);
    }
    public static int gcd(int[] arr,int min) {
        int ans = 0;
        int count = 0;
        for(int i=min;i>=1;i--){
            for(int j = 0;j<arr.length;j++){
                if(arr[j]%i==0) count++;
            }
            if(count==arr.length) {
                ans = i;
                break;
            }
        }
        return ans;
    }   
}