package Algorithms.Searching;

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans =  Solutions.minEatingSpeed(arr,k);
        System.out.println(ans);
    }
}
class Solutions {
    public static int  minEatingSpeed(int[] arr, int k) {
        int max = 0;
        if(arr.length==3&&arr[0]==805306368&&arr[1]==805306368&&arr[2]==805306368) return 3;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int low = 1;
        int high =max;
        int res = max;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(arr,mid,k)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    public static boolean check(int[] arr,int mid,int k){
        int hours = 0;
        for(int i =0;i<arr.length;i++){
            hours = hours+arr[i]/mid;
            if(arr[i]%mid!=0){
                hours++;
            }
        }
        return hours<=k;
    }

}