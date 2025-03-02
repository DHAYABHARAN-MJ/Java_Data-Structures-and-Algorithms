package DataStructures.String;

import java.util.Scanner;
public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = 0;
        int end = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(check(s,i,j)&& j-i+1>count){
                    count = Math.max(count,j-i+1);
                    start = i;
                    end = j;
                }
            }
        }
        for (int i = start; i <=end; i++) {
            System.out.print(s.charAt(i));
        }
    }
    public static boolean check(String s, int start, int end) {
        int[] count = new int[256];
        for (int i = start; i <=end; i++) {
            if(count[s.charAt(i)]!=0){
                return false;
            }
            count[s.charAt(i)]++;
        }
        return true;
    }
}