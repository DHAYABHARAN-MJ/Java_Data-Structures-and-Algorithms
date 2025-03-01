package DataStructures.HashTable;

import java.util.*;
public class Stringcompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = Strcomp(s);
        System.out.println(res);
    }
    public static String Strcomp(String s) {
        StringBuilder res = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {  // Only process first occurrence
                res.append(c);
                res.append(map.get(c));
                seen.add(c); // Mark character as processed
            }
        }
        return res.toString();
    }
}