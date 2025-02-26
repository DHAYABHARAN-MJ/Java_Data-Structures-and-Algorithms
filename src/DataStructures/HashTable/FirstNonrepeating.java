package DataStructures.HashTable;
/*
Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.
 */
import java.util.*;
class FirstNonrepeating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = Solutions.nonRepeatingChar(s);
        if(c=='$')
        System.out.println(-1);
        else {
            System.out.println(c);
        }
    }
}
class Solutions {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int len = s.length();
        for(int i =0;i<len;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i =0;i<len;i++){
            if(hm.get(s.charAt(i))!=1) continue;
            else{
                return s.charAt(i);
            }
        }
        return '$';
    }
}