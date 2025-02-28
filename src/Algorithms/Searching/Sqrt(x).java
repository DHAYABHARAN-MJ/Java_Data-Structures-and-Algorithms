package Algorithms.Searching;

import java.util.Scanner;
class Sqrt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = answer1.floorSqrt(n);
        System.out.println(ans);
    }
}
class answer1{
    static int floorSqrt(int n) {
        if(n==0||n==1) return n;
        int left = 1;
        int right = n/2;
        int ans =0;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid>n) right = mid - 1;
            else if(mid*mid<n){ left = mid+1;
                ans = mid;

            }
        }
        return ans;
    }
}