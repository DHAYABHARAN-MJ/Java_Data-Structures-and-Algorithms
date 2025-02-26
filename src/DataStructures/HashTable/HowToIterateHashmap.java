package DataStructures.HashTable;

import java.util.*;
public class HowToIterateHashmap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            map1.put(word2.charAt(i), map1.getOrDefault(word2.charAt(i), 0) - 1);
        }
        for(int value: map1.values()) {
            if(value != 0) {
                System.out.println("False");
            }
        }
        System.out.println("True");
    }
}