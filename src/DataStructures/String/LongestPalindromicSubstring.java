package DataStructures.String;

import java.util.Scanner;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(check(s,i,j)&& j-i+1>maxLength){
                    maxLength = Math.max(maxLength,j-i+1);
                    start = i;
                    end = j;
                }
            }
        }
       for (int i = start; i <= end; i++) {
           System.out.print(s.charAt(i));
       }
    }
    public static boolean check(String s, int left, int right) {
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}