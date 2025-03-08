package DataStructures.String;

import java.util.Scanner;
public class LongestPalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s) {
        // code here
        int start = 0;
        int maxlen = 1;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<=1;j++){
                int low = i;
                int high = i+j;
                while(low>=0&&high<s.length()&& s.charAt(low)==s.charAt(high)){
                    int currlen = high - low + 1;
                    if(maxlen<currlen){
                        maxlen = currlen;
                        start = low;
                    }
                    low--;
                    high++;
                }
            }
        }
        return s.substring(start,start+maxlen);
    }
}