package Algorithms.Searching;

import java.util.Scanner;
public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Solution.arrangeCoins(n);
        System.out.println(ans);
    }
}
class Solution {
    public static int arrangeCoins(int n) {
        int i = 1;
        while(n>0){

            i++;
            n = n-i;
        }
        return i-1;
    }
}