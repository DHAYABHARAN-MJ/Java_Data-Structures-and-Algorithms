package DataStructures.HashTable;

import java.util.*;
class GroupAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        System.out.print(ga.groupanagrams(str));
    }
}
class ga{
    public static List<List<String>> groupanagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < str.length; i++){
            String s = str[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}