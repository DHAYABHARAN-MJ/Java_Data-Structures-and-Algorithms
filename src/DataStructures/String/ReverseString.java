package DataStructures.String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = reverse(str);
        System.out.println(res);
    }
    public static String reverse(String str) {
        int left = 0, right = str.length() - 1;
        StringBuffer sb = new StringBuffer(str);
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();
    }
}
