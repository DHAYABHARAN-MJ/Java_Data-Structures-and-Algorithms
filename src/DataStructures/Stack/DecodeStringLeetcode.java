package DataStructures.Stack;/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated
exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-
formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are
only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 */
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = answer.decode(s);
        System.out.println(res);
    }
}
class answer{
    public static String decode(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');  // Handle multi-digit numbers
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(currentString);
                currentString = new StringBuilder(); // Start new string inside brackets
                num = 0;
            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder decodedPart = stringStack.pop();
                while (repeatTimes-- > 0) {
                    decodedPart.append(currentString);
                }
                currentString = decodedPart;
            } else {
                currentString.append(c);  // Append regular characters
            }
        }
        return currentString.toString();
    }
}