package DataStructures.String;

import java.util.*;
class findNumberOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(check(s,i,j,t)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean check(String s, int start, int end, String t) {
        return t.equals(s.substring(start, end));
    }
}