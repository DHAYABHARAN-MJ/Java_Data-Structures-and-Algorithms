package DataStructures.HashTable;
/*
Find the frequency of each character in a string:
 */
import java.util.*;
class frequencyofCharacters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        System.out.println(hm);
    }
}