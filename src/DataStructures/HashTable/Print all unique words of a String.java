package DataStructures.HashTable;
/*
Write a function that takes a String as an argument and prints all unique words in it.

Examples:

Input: Java is great. Grails is also great
Output:       Java
              Grails
              also
 */
import java.util.*;
class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        for(int i = 0; i < words.length; i++){
            if(map.get(words[i]) == 1){
                System.out.println(words[i]);
            }
        }
    }
}