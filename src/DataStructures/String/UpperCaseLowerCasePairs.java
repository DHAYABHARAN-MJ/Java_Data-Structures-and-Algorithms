package DataStructures.String;

import java.util.*;
public class UpperCaseLowerCasePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        int count = 0;
        for(char c : set){
            if(Character.isLowerCase(c)&&set.contains(Character.toUpperCase(c))){
                count++;
            }
        }
        System.out.println(count);
    }
}