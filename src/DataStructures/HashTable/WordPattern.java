package DataStructures.HashTable;

import java.util.*;
public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String word = sc.nextLine();
        boolean res = WP.word(pattern,word);
        System.out.println(res);
    }
}
class WP {
    public static boolean word(String pattern, String word) {
        char[] patternArray = pattern.toCharArray();
        String[] wordArray = word.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(patternArray.length != wordArray.length){ return false; }
        for(int i = 0; i < patternArray.length; i++){
            if(map.containsKey(patternArray[i])){
                if(!map.get(patternArray[i]).equals(wordArray[i])){
                    return false;
                }
            }
            else {
                if (map.containsValue(wordArray[i])) {
                    return false;
                }
                map.put(patternArray[i], wordArray[i]);
            }
        }
        return true;
    }
}